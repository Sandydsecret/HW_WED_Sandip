package hw_wed_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Pro_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit :");
        float temp = scan.nextFloat();
        Pro_7 obj=new Pro_7();
        obj.degreeconverter(temp);

    }
    public void degreeconverter(float temp){
        float c =((temp-32)*5/9);
        System.out.println("the temperature " + temp+" fahrenheit is equal to "+c+" degree ccelsius");
    }

}
