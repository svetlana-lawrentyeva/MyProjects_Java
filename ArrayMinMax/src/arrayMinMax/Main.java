package arrayMinMax;

public class Main {
	public static void main(String[]args)
	{
		//int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray();
		System.out.println(arr);
		arr.sort();
		System.out.println(arr);
		System.out.println("--------------");
		Stars.square();
		System.out.println("--------------");
		Stars.X();
		System.out.println("--------------");
		Stars.tr1();
		System.out.println("--------------");
		Stars.tr2();
		System.out.println("--------------");
		Stars.tr3();
	}
}
