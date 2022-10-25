package week8HwDipak;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class Pro_9_FibonacciNumber {

    public static void main(String[] args) {
        int num, firstNum = 1, secondNum = 1;
        System.out.print("Enter number: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        System.out.println("Fibonacci Series till " + num + " number:");
        scn.close();

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstNum + " ");

            // compute the next term
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

        }
    }
}
