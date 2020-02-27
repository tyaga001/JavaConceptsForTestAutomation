package conceptOfJava.constructorInJava;

public class ConstructorOverloadingExample {


    private int stuID;
    private String stuName;
    private int stuAge;

    ConstructorOverloadingExample() {
        //Default constructor
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }

    ConstructorOverloadingExample(int num1, String str, int num2) {
        //Parameterized constructor
        stuID = num1;
        stuName = str;
        stuAge = num2;
    }

    public static void main(String args[]) {
        //This object creation would call the default constructor
        ConstructorOverloadingExample myobj = new ConstructorOverloadingExample();
        System.out.println("Student Name is: " + myobj.getStuName());
        System.out.println("Student Age is: " + myobj.getStuAge());
        System.out.println("Student ID is: " + myobj.getStuID());

        /*This object creation would call the parameterized
         * constructor StudentData(int, String, int)*/
        ConstructorOverloadingExample myobj2 = new ConstructorOverloadingExample(555, "Ankur", 25);
        System.out.println("Student Name is: " + myobj2.getStuName());
        System.out.println("Student Age is: " + myobj2.getStuAge());
        System.out.println("Student ID is: " + myobj2.getStuID());
    }

    //Getter and setter methods
    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
