package conceptOfJava.constructorInJava;

public class OverloadingExample2 {
    private int rollNum;

    private OverloadingExample2() {
        rollNum = 100;
    }

    private OverloadingExample2(int rnum) {
        this();
        /*this() is used for calling the default
         * constructor from parameterized constructor.
         * It should always be the first statement
         * inside constructor body.
         */
        rollNum = rollNum + rnum;
    }

    public static void main(String args[]) {
        OverloadingExample2 obj = new OverloadingExample2(12);
        System.out.println(obj.getRollNum());
    }

    private int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}


/*As you can see in the above program that we called the parameterized constructor during object creation.
        Since we have this() placed in parameterized constructor,
        the default constructor got invoked from it and initialized the variable rollNum.*/
