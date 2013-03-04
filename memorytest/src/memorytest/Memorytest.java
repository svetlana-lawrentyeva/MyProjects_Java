/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorytest;

/**
 *
 * @author nau
 */
public class Memorytest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        String ar[]=new String[10000];
        for(int i=0; i<10000;++i)
        {
            
                ar[i]="";
            
        }
        
        for(int i=0; i<10000;++i)
        {
            for(int j=0;j<5000;++j)
            {
                ar[i]=ar[i]+j;
            }
            System.out.println(ar[i]);
        }
    }
}
