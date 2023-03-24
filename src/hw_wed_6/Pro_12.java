package hw_wed_6;
/*Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

public class Pro_12 {
    public static void main(String[] args) {
        Pro_12 obj = new Pro_12();
        obj.printexpressions();
    }
    public void printexpressions(){
        double a= ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(a);
    }
}

