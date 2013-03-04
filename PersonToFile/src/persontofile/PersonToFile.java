/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontofile;

/**
 *
 * @author nau
 */
public class PersonToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("begin");
        Person p1=new Person(5, "qwerty", "asdf", 32);
        Person p2=new Person(6, ";;", "[[", 55);
        PList pl = new PList();
        pl.Load();
        PrintList(pl);
        pl.AddToList(p1);
        pl.AddToList(p2);
        int res=pl.Save();
        PrintList(pl);
        System.out.println(res);
    }
    public static void PrintList(PList pl) {
        for(Person p:pl.getList()) {
            System.out.println("id: "+p.getId());
            System.out.println("fName: "+p.getFName());
            System.out.println("lName: "+p.getLName());
            System.out.println("age: "+p.getAge());
            System.out.println("-----------------");
        }
    }
}
