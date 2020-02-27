package conceptOfJava;

public class StaticConstructor {

    protected StaticConstructor() {
        /*Constructor of this class*/
        System.out.println("StaticConstructor");
    }
}

class StaticConstructorChild extends StaticConstructor {
    private StaticConstructorChild() {
        /*By default super() is hidden here */
        System.out.println("StaticConstructorChild");
    }

    public static void main(String args[]) {
        StaticConstructorChild obj = new StaticConstructorChild();
        obj.display();
    }

    private void display() {
        System.out.println("method of child class");
    }
}

/*
Output:
        StaticConstructor
        StaticConstructorChild
        method of child class*/
