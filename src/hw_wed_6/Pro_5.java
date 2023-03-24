package hw_wed_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */

public class Pro_5 {
    public static void additiion(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and" + b + " is: " + result);

    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " is: " + result);

    }

    public void multiplication(int a, int b) {
        int result = a*b;
        System.out.println("The multiplication of "+a+" and "+b+" is: "+result);



    }

    public void division(int a, int b) {
        int result = a/b;
        System.out.println("The division of "+a+" and "+b+" is: "+result);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        additiion(a,b);
        subtraction(a,b);
        Pro_5 obj =new Pro_5();
        obj.division(a,b);
        obj.multiplication(a,b);


    }

}
