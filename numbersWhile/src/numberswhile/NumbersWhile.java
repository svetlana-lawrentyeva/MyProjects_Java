/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberswhile;

/**
 *
 * @author nau
 */
public class NumbersWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numbers1_10();
        System.out.println();
        numbers0_100();
        System.out.println();
        numbers0_20();
        System.out.println();
        numbers_10_25();
    }
    public static void numbers1_10() {
        int i=1;
        while(i<=10) {
            System.out.print(i+" ");
            ++i;
        }
    }
    public static void numbers_10_25() {
        int i=-10;
        while(i<=25) {
            System.out.print(i+" ");
            ++i;
        }
    }public static void numbers0_100() {
        int i=0;
        while(i<=100) {
            System.out.print(i+" ");
            i+=5;
        }
    }public static void numbers0_20() {
        int i=0;
        while(i<=20) {
            System.out.print(i+" ");
            i+=2;
        }
    }
}
