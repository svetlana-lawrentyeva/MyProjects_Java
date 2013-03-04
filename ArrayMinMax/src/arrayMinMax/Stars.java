package arrayMinMax;

public class Stars {
	private static int size=8;
	public static void square()
	{
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size;++j)
			{
				if(i==0||i==size-1||j==0||j==size-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void X()
	{
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size;++j)
			{
				if(i==j||i+j==size-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void tr1()
	{
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size;++j)
			{
				if(i==j||i==0||j==size-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void tr2()
	{
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size;++j)
			{
				if(i+j==size-1||i==0||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void tr3()
	{
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size;++j)
			{
				if(j==0||(i==j&i<size/2)||(i+j==size-1&i>size/2-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
