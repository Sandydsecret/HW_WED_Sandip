package hw_wed_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Pro_9 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the uppercase string : ");
    String uppercase = scan.nextLine();

    Pro_9 obj1 =new Pro_9();
    obj1.convertUppercaseToLowerCase(uppercase);
    }
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = "+text.toLowerCase());
    }


}
