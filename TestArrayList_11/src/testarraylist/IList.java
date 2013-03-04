package testarraylist;

public interface IList
{
  public void addStart(int value);
  public void addEnd(int value);
  public void addPosition(int position, int value);
  public void delStart();
  public void delEnd();
  public void delPosition(int position);
  public void set(int position, int value);
  public int get(int position);
  public void clear();
  public int size();
  public void sort();
  public void revers();
  public IList copy();
  public String toString();
  public int[] toArray();
  public void init(int[]initArray);
}
