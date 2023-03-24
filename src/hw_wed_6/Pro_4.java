package hw_wed_6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Pro_4 {
    String name = "Prime testing";
    String nane1 = "Softer tester";//4.1 Declare two instance and two static variables.
    static boolean a = true;
    static boolean b = false;

    public void instancemethod() {     //4.2 Declare one instance method.
        System.out.println(name);
        System.out.println(nane1);
        System.out.println(a);
        System.out.println(b);

    }

    public static void staticmethod() {    //4.3 Declare one static method
        Pro_4 obj =new Pro_4();
        System.out.println(obj.name);
        System.out.println(obj.nane1);
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Pro_4 obj1 =new Pro_4();
        //obj1.instancemethod();
        staticmethod();

    }



}
