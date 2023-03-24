package hw_wed_6;
/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Pro_2 {
    static int a=10;      // 2.1 Declare two static variables
    static int b=20;
    public static void staticmethod(){   // Declare one static method
        System.out.println(a);    // Call both static variables into the static method inside the print statement.
        System.out.println(b);
    }

    public static void main(String[] args) {       // Declare the Main method.
        staticmethod();
    }
}
