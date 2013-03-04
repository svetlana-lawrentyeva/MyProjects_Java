package arrayMinMax;

public class MyArray {
	private int[]arr={};
	
	public MyArray()
	{
		arr=new int[10];
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=(int) (Math.random()*51);
		}
	}
	public MyArray(int[]InitArr)
	{
		init(InitArr);
	}
	public void init(int[]InitArr)
	{
		arr=new int[InitArr.length];
		for(int i=0;i<InitArr.length;++i)
		{
			this.arr[i]=InitArr[i];
		}
	}
	public int getMax()
	{
		if(arr.length==0)throw new ArithmeticException();
		int max=arr[0];
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public int getMin()
	{
		if(arr.length==0)throw new ArithmeticException();
		int min=arr[0];
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public int getMaxInd()
	{
		if(arr.length==0)throw new ArithmeticException();
		int max=arr[0];
		int maxInd=0;
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxInd=i;
			}
		}
		return maxInd;
	}
	public int getMinInd()
	{
		if(arr.length==0)throw new ArithmeticException();
		int min=arr[0];
		int minInd=0;
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				minInd=i;
			}
		}
		return minInd;
	}
	public void sort()
	{
		if(arr.length==0)throw new ArithmeticException();
		if(arr.length==1)return;
		for(int i=1;i<arr.length;++i)
		{
			for(int j=i;j>=1;--j)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public String toString()
	{
		String result="";
		for(int i=0;i<arr.length;++i)
		{
			if(i!=0)
			{
				result=result+" "+arr[i];
			}
			else
			{
				result=""+arr[i];
			}
		}
		return result;
	}
}
