/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starswhile;

/**
 *
 * @author nau
 */
public class StarsWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stars1();
        stars2();
        stars3();
        stars4();
    }

    private static void stars1() {
        int length=7;
        int i=1;
        while(i<=length) {
        int j=1;
            while(j<=length+1-i) {
                if(i==1||j==1||j==length+1-i) System.out.print("*");
                else System.out.print(" ");
                ++j;
            }
            ++i;
            System.out.println();
        }
    }

    private static void stars2() {
        int length=7;
        int i=1;
        while(i<=length) {
            int j=1;
            while(j<=i) {
                if(i==length||j==1||j==i) System.out.print("*");
                else System.out.print(" ");
                ++j;
            }
            System.out.println();
            ++i;
        }
    }

    private static void stars3() {
        int length=7;
        int i=1;
        do {
            int j=1;
            do {
                if(i==1||j==i||j==length) System.out.print("*");
                else System.out.print(" ");
                ++j;
            } while(j<=length);
            System.out.println();
            ++i;
        } while(i<=length);
    }

    private static void stars4() {
        int length=7;
        int i=1;
        do {
            int j=1;
            do {
                if(i==length||j==length+1-i||j==length) System.out.print("*");
                else System.out.print(" ");
                ++j;
            } while(j<=length);
            System.out.println();
            ++i;
        } while(i<=length);
    }
}
