package hw_wed_6;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public  class Pro_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double x = scan.nextDouble();
        System.out.println("Enter second number :");
        double y = scan.nextDouble();
        System.out.println("Enter third number :");
        double z =scan.nextDouble();
        avaerage(x , y ,z);

    }
    public static void avaerage(double x,double y,double z){
        double average = (x + y + z)/3;
        System.out.println("The average of " + x + " , " + y + " and " + z + " is : " + average);


    }


}
