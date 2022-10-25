package week8HwDipak;

import java.util.Scanner;

//15. Display left angle triangle of * using nested for loops
public class Pro_15_LeftAngleTriangle {

    public static void main(String[] args) {
        triangle();
    }
    public static void triangle() {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int k = scan.nextInt();
        for (a = 0; a < k; a++) {

            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
            scan.close();
        }
    }
}
