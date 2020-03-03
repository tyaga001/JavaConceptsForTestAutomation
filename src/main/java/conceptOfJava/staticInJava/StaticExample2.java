package conceptOfJava.staticInJava;

public class StaticExample2 {

    private static int var1;
    private static String var2;

    /*
        This is a Static Method
    */
    private static void myStaticMethod() {
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
    }

    public static void main(String args[]) {
        myStaticMethod();
    }
}

/*
Output:

        Var1 is: 0
        Var2 is: null*/
