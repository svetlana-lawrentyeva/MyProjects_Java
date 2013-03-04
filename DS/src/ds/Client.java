/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author nau
 */
public class Client extends Person
{
    private int discount;
    public Client(int _id, String _fName, String _lName, int _age)
    {
        super(_id, _fName, _lName, _age);
        discount=0;
    }
    public int getDiscount()
    {
        return discount;
    }
    public void setDiscount(int _discount)
    {
        discount=_discount;
    }

    @Override
    public String getInfo()
    {
        return discount+"";
    }
     @Override
    public boolean equals(Object o)
    {
        boolean result=false;
        Client c=(Client)o;
        if(super.equals(c))
        {
            if(c.discount==this.discount)result=true;
        }
        return result;
    }
}
