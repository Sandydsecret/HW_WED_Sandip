package hw_wed_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Pro_17 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to convert decimal to binary number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scan.nextInt();
        convertDecimalToBinary(number);
        scan.close();
    }

    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is: " + binary);
    }


}
