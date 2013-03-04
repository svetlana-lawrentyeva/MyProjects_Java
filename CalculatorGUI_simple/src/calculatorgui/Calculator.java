package calculatorgui;

public class Calculator
{
    public static int Calc(int a, int b, char c)
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
                if(b==0)
                {
                    throw new ArithmeticException("error: devide by zero");
                }
                else
                {
                    result=a/b;
                }
                break;
            default:
                throw new IllegalArgumentException("error: wrong operation");                    
        }
        return result;
    }
}
