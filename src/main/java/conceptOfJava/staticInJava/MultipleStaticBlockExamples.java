package conceptOfJava.staticInJava;

public class MultipleStaticBlockExamples {

    private static int num;
    private static String mystr;

    /*
        First Static block
    */
    static {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }

    /*
        Second static block
    */
    static {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String args[]) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of mystr: " + mystr);
    }

}

/*
Output:

        Static Block 1
        Static Block 2
        Value of num: 98
        Value of mystr: Block2*/
/*

They execute in the given order which means the first static block executes before second static block.
        That’s the reason, values initialized by first block are overwritten by second block.
*/
