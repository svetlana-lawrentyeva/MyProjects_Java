package binarytree;

public interface ITree extends Iterable<Integer>
{
    public void init(int[]arr);
    public void add(int value);
    public void del(int value);
    public int count();
    public int countLeafs();
    public int countBranches();
    public int countLevels();
    public int countColumns();
    public void print();
    public void clear();
    public boolean equals(ITree tree);
    public Object getRoot();
}
