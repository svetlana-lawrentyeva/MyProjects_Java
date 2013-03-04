/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

/**
 *
 * @author nau
 */
public class DS_Mock implements DS
{

    @Override
    public int Save(PList p)
    {
        this.quantity=p.size();
        return 1;
    }

    @Override
    public PList Load()
    {
        PList pl=new PList();
        for(int i=0;i<this.quantity;++i)
        {
            pl.add(new Person(21, "p1fName", "p1lName", 21));
        }
        return pl;
    }
    private int quantity;
}
