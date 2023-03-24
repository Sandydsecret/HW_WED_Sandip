package hw_wed_6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Pro_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scan.nextDouble();
        areaofcircle(radius);
    }

    public static void areaofcircle(double radius) {
        double pi = Math.PI;
        //double radius = 0;
        double area = pi * radius * radius;
        System.out.println("The area of circle is : " + area);
    }
}
