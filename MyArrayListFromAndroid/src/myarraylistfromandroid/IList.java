package myarraylistfromandroid;

public interface IList
{
    public void init(int[]initArray);
    public int size();
    public void addStart(int value);
    public void addEnd(int value);
    public void addPos(int position, int value);
    public void delStart();
    public void delEnd();
    public void delPos(int position);
    public void sort();
    public void set(int position, int value);
    public int get(int position);
    public void clear();
    public IList copy();
}
