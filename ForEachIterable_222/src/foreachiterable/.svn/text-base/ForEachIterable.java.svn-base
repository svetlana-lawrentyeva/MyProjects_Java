/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachiterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author nau
 */
public class ForEachIterable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
	{ 
		StrIterable x = new StrIterable("This is a test."); 
        for (Iterator it = x.iterator(); it.hasNext();) {
            char ch = it.next();
            System.out.print(ch);
        }
	
	System.out.println(); 
	} 
}

class StrIterable implements Iterable, Iterator
{
	private String str;
	private int count = 0;
	
	StrIterable(String s)
	{
		str = s; 
	} 
	// The next three methods impement Iterator.
	
	public boolean hasNext()
	{ 
		if(count < str.length()) return true; 
		return false; 
	} 
	public Character next()
	{ 
		if(count == str.length()) 
		throw new NoSuchElementException(); 
		
		count++; 
		return str.charAt(count-1); 
	}
	
	public void remove ()
	{
		throw new UnsupportedOperationException(); 
	} 

	// This method implements Iterable. 
	
		

    @Override
    public Iterator iterator()
    {
        return this; 
    }
    
} 
