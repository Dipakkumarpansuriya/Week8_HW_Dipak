package week8HwDipak;
//12. Write a programme to input any number and check if it is prime or not.

import java.util.Scanner;

public class Pro_12_PrimeNumber {
    public static void main(String[] args) {
        prime();
    }
    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check, is prime number or not: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
        sc.close();
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}

