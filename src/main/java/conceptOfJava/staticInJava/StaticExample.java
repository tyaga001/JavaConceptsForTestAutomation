package conceptOfJava.staticInJava;

public class StaticExample {

    /*   This is a static method.
     *   when we make a member static it becomes class level.
     * If we remove the static keyword and make it non-static
     * then we must need to create an object of the class in order to call it.
     * */
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }

    public static void main(String[] args) {
        /* You can see that we are calling this
         * method without creating any object here.
         */
        myStaticMethod();
    }

}
