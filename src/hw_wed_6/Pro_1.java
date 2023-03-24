package hw_wed_6;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Pro_1 {

    int a = 10;         //1.1 Declare two instance variable
    int b = 20;

    public void instancemethod() {   // 1.2 declare one instance method
        System.out.println(a);      //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(b);


    }

    public static void main(String[] args) { //1.4  Declare the Main method.
        Pro_1 obj1 =new Pro_1();
        obj1.instancemethod();

    }


}
