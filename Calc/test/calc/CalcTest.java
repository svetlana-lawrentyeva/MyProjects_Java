/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author nau
 */
@RunWith(Parameterized.class)
public class CalcTest {

    //@BeforeClass
    //public static void getC(){
    //    Calc[]list=new Calc[]{
    //                new CalcM(),
    //                new CalcR()
    //            };
    //    for(Calc cl:list) {
    //        c=cl;
    //    }
    //}
    @Parameterized.Parameters
    public static Collection data() {
       return Arrays.asList(new Object[][]{
                    {new CalcM(),""},
                    {new CalcR(),""}
                });
    }
    public CalcTest(Calc c, String s) {
        //List<Calc> list = (List<Calc>)data();
        //for(Calc cl:list){
        //    this.c=cl;
        //}
        this.c=c;
        this.s=s;
        }

    /**
     * Test of main method, of class CalcR.
     */
    @Test
    public void testPlus() {
        int val=c.calc(5,5,'+');
        assertEquals(10, val);
    }  
    @Test
    public void testMinus() {
        int val=c.calc(20,10,'-');
        assertEquals(10, val);
    }  
    @Test
    public void testMultiply() {
        int val=c.calc(2,5,'*');
        assertEquals(10, val);
    }  
    @Test
    public void testDevide() {
        int val=c.calc(20,2,'/');
        assertEquals(10, val);
    }
    @Test
    (expected=ArithmeticException.class)
    public void TestDevideByZero() {
        int val=c.calc(20, 0, '/');
    }
    @Test
    (expected=IllegalArgumentException.class)
    public void TestIllegalArgument() {
        int val=c.calc(20, 10, '%');
    }
    static Calc c;
    String s;
}
