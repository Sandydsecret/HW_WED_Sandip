package hw_wed_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Pro_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter uppercase sentence: ");
        String uppercase = scan.nextLine();
        Pro_19 obj = new Pro_19();
        obj.convertStringToLowerCase(uppercase);
    }

    public void convertStringToLowerCase(String str) {
        System.out.println("The lowercase of the string is = " + str.toLowerCase());
    }

}
