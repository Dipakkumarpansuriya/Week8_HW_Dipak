package week8HwDipak;
/*6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10*/


import java.util.Scanner;

public class Pro_6_TriangleNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = input.nextInt();
        input.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}