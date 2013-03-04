/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author nau
 */
public class CalcR implements Calc{

    @Override
    public int calc(int a, int b, char c) {
        int result=0;
        switch(c){
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
                if(b!=0){
                    result=a/b;
                }
                else{
                    throw new ArithmeticException("devide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("wrong sign");
        }
        return result;
    }
}
