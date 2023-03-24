package hw_wed_6;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Pro_15 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scan.nextInt();
        System.out.println("Enter the second variable value : ");
        int second= scan.nextInt();
        Pro_15 obj = new Pro_15();
        obj.swapTheValue(first,second);
    }
    public void swapTheValue(int a ,int b){
        int c;
        System.out.println("Before swaping , The value of first variable is :" + a + " and second variable is : " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

    }

}
