package datasave;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */ 

import java.io.Serializable;


/**
 *
 * @author nau
 */
public class Person implements Serializable{


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value of fName
     *
     * @return the value of fName
     */
    public String getFName() {
        return fName;
    }

    /**
     * Set the value of fName
     *
     * @param fName new value of fName
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * Get the value of lName
     *
     * @return the value of lName
     */
    public String getLName() {
        return lName;
    }

    /**
     * Set the value of lName
     *
     * @param lName new value of lName
     */
    public void setLName(String lName) {
        this.lName = lName;
    }
    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String fName, String lName, int age) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }
    
    public String PrintPerson() {
        String result="";
        result="Id: "+id;
        result+="\nfName: "+fName;
        result+="\nlName: "+lName;
        result+="\nage: "+age;
        return result;
    }
    @Override
    public String toString() {
        String result="";
        result=id+"\n";
        result+=fName+"\n";
        result+=lName+"\n";
        result+=age+"\n";
        return result;
    }
    
    public static Person fromString(String s) {
        String[] sArray=s.split("\n");
        int id=Integer.parseInt(sArray[0]);
        String fName=sArray[1];
        String lName=sArray[2];
        int age=Integer.parseInt(sArray[3]);
        return new Person(id, fName, lName, age);
    }
    public String toXML(int level) {
        String result="<Person>\n";
        result+="<id>"+id+"</id>\n";
        result+="<fName>"+fName+"</fName>\n";
        result+="<lName>"+lName+"</lName>\n";
        result+="<age>"+age+"</age>\n";
        result+="</Person>\n";
        return result;
    }

    public static Person fromXML(String s) {
        String[] sArray=s.split("\n");
        String idString=sArray[0].replaceAll("<id>", "");
        idString=idString.replace("</id>", "");
        int id=Integer.parseInt(idString);
        String fName=sArray[1].replace("<fName>", "");
        fName=fName.replace("</fName>", "");
        String lName=sArray[2].replace("<lName>", "");
        lName=lName.replace("</lName>", "");
        String idAge=sArray[3].replaceAll("<age>", "");
        idAge=idAge.replace("</age>", "");
        int age=Integer.parseInt(idAge);
        return new Person(id, fName, lName, age);
    }
    public String toDB() {
        String result="";
        result="insert into person values ("+id+",'"+fName+
                "','"+lName+"',"+age+");";
        return result;
    }
    @Override
    public boolean equals(Object o)
    {
        Person p=(Person)o;
        boolean res=false;
        if(p!=null)
        {
            if(p.getClass()==this.getClass())
            {
                if(this.fName.equals(p.getFName())&this.lName.equals(p.getLName())
                        &this.id==p.getId()&this.age==p.getAge()) res=true;
            }
        }
        return res;
    }
    private int id;
    private String fName;
    private String lName;
    private int age;
}

