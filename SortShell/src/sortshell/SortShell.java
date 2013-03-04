package sortshell;

public class SortShell
{
    private static int[] arr={32,95,16,82,24,66,35,19,75,54,40,43,93,68,100,55,336,12,7,96,885,48,35,115,566,0,125,-5,-66};
    private static int[] sequenceStep={1,4,10,23,57,132,301,701,1750};
    
    public static void main(String[] args)
    {
       sortShell();
       printArray();
    }
    public static void  printArray()
    {
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sortShell()
    {
        int step=0;
        int i=0;
        while(sequenceStep[i]<=arr.length/2&i<sequenceStep.length)
        {
            step=sequenceStep[i];
            ++i;
        }
        for(int j=i;j>=0;--j)
        {
            sortShell(sequenceStep[j]);
        }
    }
    private static void sortShell(int step)
    {
        int i=0;
        while(i+step<arr.length)
        {
            for(int j=i+step;j>0;j-=step)
            {
                if(arr[j]<arr[j-step])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-step];
                    arr[j-step]=temp;
                }
            }
            i+=step;
        }
    }
}
