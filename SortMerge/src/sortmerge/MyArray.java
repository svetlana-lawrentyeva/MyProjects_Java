package sortmerge;

public class MyArray
{
    private int[] arr;
    
    public void init(int[]arr)
    {
        this.arr=arr;
    }
    public void sortMerge()
    {
        sortMerge(0, this.arr.length-1);
    }
    private void sortMerge(int left, int right)
    {
        if(left>=right)return;
        int middle=(left+right)/2;
        sortMerge(left,middle);
        sortMerge(middle+1, right);        
        merge(left, middle, right);
    }
    private void merge(int left,int middle,int right)
    {
        int j=middle+1;
        while(j<=right)
        {
            int i=j-1;
            boolean isProcessing=true;
            while(i>=left&isProcessing)
            {
                if(arr[i+1]<arr[i])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    --i;                    
                }
                else isProcessing=false;
            }
            ++j;
        }
    }
    public void printArray()
    {
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private void printArray(int left,int right)
    {
        for(int i=left;i<=right;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
