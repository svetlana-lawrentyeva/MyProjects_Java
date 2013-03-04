/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberssquarewhile;

/**
 *
 * @author nau
 */
public class NumbersSquareWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numbers1177();
        numbers7711();
        numbers1717();
        numbers7171();
    }

    private static void numbers1177() {
        int length=7;
        int i=1;
        while (i<=7) {
            int j=1;
            while (j<=7) {
                System.out.print(i);
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
//---------------------------------------------------------------
    private static void numbers7711() {
        int length=7;
        int i=length;
        while (i>=1) {
            int j=1;
            while (j<=7) {
                System.out.print(i);
                ++j;
            }
            System.out.println();
            --i;
        }
    }
//---------------------------------------------------------------
    private static void numbers1717() {
        int length=7;
        int i=1;
        while (i<=length) {
            int j=1;
            while (j<=7) {
                System.out.print(j);
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
//---------------------------------------------------------------
    private static void numbers7171() {
        int length=7;
        int i=1;
        while (i<=length) {
            int j=length;
            while (j>=1) {
                System.out.print(j);
                --j;
            }
            System.out.println();
            ++i;
        }
    }
}
