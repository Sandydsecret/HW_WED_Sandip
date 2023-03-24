package hw_wed_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Pro_8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the lenghth of the triangle :");
        int length = scan.nextInt();
        System.out.println("Please enter the heihght of the triangle : ");
        int height = scan.nextInt();
        Pro_8 obj =new Pro_8();
        obj.areaoftriangle(length ,height);

    }
    public  void areaoftriangle(int length , int height){
        int area =length*height/2 ;
        System.out.println("The area of a triangle : "+area);
    }

}
