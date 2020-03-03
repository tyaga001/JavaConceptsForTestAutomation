package conceptOfJava.staticInJava;

public class StaticBlockExample {

    private static int mynum;
    private static String mystring;

    static {
        mynum = 97;
        mystring = "Static keyword in Java";
    }

    public static void main(String args[]) {
        System.out.println("Value of num: " + mynum);
        System.out.println("Value of mystring: " + mystring);
    }


}

/*
Output:

        Value of num: 97
        Value of mystr: Static keyword in Java
*/

