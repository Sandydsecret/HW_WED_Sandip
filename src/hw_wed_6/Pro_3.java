package hw_wed_6;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Pro_3 {
    String name = "Team Jira";
    static String job = "Software Tester";//3.1 Declare one instance and one static variable.

    public void instancemethod() {  //3.2 Declare one instance method
        System.out.println(name);
        System.out.println(job);// .Call both instance and static variables into both instance and static methods inside the print statement.
    }

    public static void staticmethod() {   //3.3 Declare one static method.
        Pro_3 obj = new Pro_3();
        System.out.println(obj.name);
        System.out.println(job);
    }

    public static void main(String[] args) {
        Pro_3 obj1 = new Pro_3();
        staticmethod();


    }
}
