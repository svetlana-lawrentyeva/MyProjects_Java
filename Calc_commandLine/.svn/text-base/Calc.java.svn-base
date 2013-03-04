public class Calc {
	public static int count(int a, int b, char c)
	{
		int result=0;
		switch(c)
		{
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			if(b!=0)
			{
				result=a/b;
			}
			else throw new ArithmeticException("devide by zero");
			break;
			default:
				throw new IllegalArgumentException("wrong sign");
		}
		return result;
	}

}
