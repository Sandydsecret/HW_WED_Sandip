package hw_wed_6;
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/

import java.util.Scanner;

public class Pro_16 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner Scan =new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first= Scan.nextLine();
        System.out.println("Please enter second binary number");
        String second =Scan.nextLine();
        String addition=addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is : " + addition);
         Scan.close();

    }
    public static String addTwoBinaryNumbers(String first,String second){
        int b1=Integer.parseInt(first,2);
        int b2=Integer.parseInt(second,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
    }

}
