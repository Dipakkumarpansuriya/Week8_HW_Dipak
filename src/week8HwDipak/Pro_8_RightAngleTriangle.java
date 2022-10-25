package week8HwDipak;

//8. Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class Pro_8_RightAngleTriangle {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = input.nextInt();
        input.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('@');
            }
            System.out.println();
        }

    }
}
