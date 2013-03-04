/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newarraylist;

/**
 *
 * @author nau
 */
public class xList
{
    private int [] array=new int[100];
    private int index=0;
    
    public void add(int value)
    {
        checkLength(index+1);
        array[index++]=value;
    }
    public void add(int value, int position)
    {
        if(position>=index)throw new ArrayIndexOutOfBoundsException();
        checkLength(index+1);
        System.arraycopy(array, position, array, position+1, index++-position);
        array[position]=value;
    }
    public void deleteAt(int position)
    {        
        if(position>=index)throw new ArrayIndexOutOfBoundsException();
        System.arraycopy(array, position+1, array, position, index-position);
        --index;
    }
    public void set(int value, int position)
    {    
        if(position>=index)throw new ArrayIndexOutOfBoundsException();
        array[position]=value;
    }
    public void clear()
    {        
        for(int i:array)
        {
            i=0;
        }
        index=0;
    }
    public void sort()
    {
        int min=0;
        int minIndex=0;
        
        for(int i=0; i<index; ++i)
        {
            min=array[i];
            minIndex=i;
            for(int j=i+1; j<index;++j)
            {
                if(array[j]<min)
                {
                    min=array[j];
                    minIndex=j;
                }
            }
            if(minIndex>i)
            {
                array[minIndex]=array[i];
                array[i]=min;
            }
        }
    }
    public int getAt(int position)
    {
        if(position>=index)throw new ArrayIndexOutOfBoundsException();
        return array[position];
    }
    public int size()
    {
        return index;
    }
    private void checkLength(int tmp)
    {
        if(tmp>=index){
            int[]tmpArray=new int[index+100];
            System.arraycopy(array, 0, tmpArray, 0, index);
            array=tmpArray;
        }
    }
}
