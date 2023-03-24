package hw_wed_6;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Pro_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the triangle :");
        int width = scan.nextInt();
        System.out.println("Enter height of the triangle ");
        int height = scan.nextInt();
        areaandprimeter(height,width);

    }
    public static void areaandprimeter(int width,int height){
        int perimetre = 2*(height+width);
        int area = (height*width);
        System.out.println("The area of the triagle : " + area);
        System.out.println("The Primeter of the rectangle is  " + perimetre);
    }
}
