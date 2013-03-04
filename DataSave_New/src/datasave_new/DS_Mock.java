/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

/**
 *
 * @author nau
 */
public class DS_Mock implements IDS
{
    private PList pl=new PList();
    public DS_Mock()
    {
        Person p1=new Person(21, "p1fName", "p1lName", 21);
        Person p2=new Person(21, "p1fName", "p1lName", 21);
        pl.add(p1);
        pl.add(p2);
    }
    @Override
    public boolean Save(PList p)
    {
        return true;
    }

    @Override
    public PList Load()
    {
        return pl;
    }
}