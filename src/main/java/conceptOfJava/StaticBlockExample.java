package conceptOfJava;

public class StaticBlockExample {

    static {
        System.out.println("static block of parent class");
    }

    public static class StaticConstructorChild extends StaticBlockExample {

        static {
            System.out.println("static block of child class");
        }

        public static void main(String args[]) {
            StaticConstructorChild obj = new StaticConstructorChild();
            obj.display();
        }

        void display() {
            System.out.println("Just a method of child class");
        }
    }
}
