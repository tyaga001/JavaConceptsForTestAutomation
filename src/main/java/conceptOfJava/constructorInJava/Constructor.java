package conceptOfJava.constructorInJava;

public class Constructor {

   /* Constructor is a block of code that initializes the newly created object.
    A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.
    People often refer constructor as special type of method in Java.
    */

    public static void main(String[] args) {
        Hello obj = new Hello();
        System.out.println(obj.getName());
        System.out.println(obj.getCode());
        System.out.println("Call of default constructor end here");


        Hello obj2 = new Hello("Javascript", 4);
        System.out.println("Automation code is written in: " + obj2.getName());
        System.out.println("Code of program is: " + obj2.getCode());
        System.out.println("Call of parameterized constructor ends here");
    }

/*   Example:In this main method we are calling both default & parameterized constructor
    When we do not pass any parameter while creating the object using new keyword then default constructor is invoked,
    however when you pass a parameter then parameterized constructor that matches with the passed parameters list gets invoked.*/

    /*  basic example of constructor in java */
    public class MyClass {
        //This is the constructor
        MyClass() {
        }
    }

}

class Hello {
    private String name;
    private int code;

    // Default Constructor in java
    Hello() {
        System.out.println("System calling Default Constructor of Java.");
        this.name = "Automation.com";
        this.code = 4;
    }

    // Parameterized Constructor in java
    public Hello(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("System calling Parameterized Constructor of Java.");
    }

    public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.code;
    }
}
