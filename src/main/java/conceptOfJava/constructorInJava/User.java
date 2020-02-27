package conceptOfJava.constructorInJava;

public class User {

    public String userName;
    public int userCode;
    public String webUrl;


    public User() {

        this("Vickey");
    }

    public User(String name) {
        //call the constructor with (String, int) param
        this(name, 120035);
    }

    public User(String name, int sal) {
        //call the constructor with (String, int, String) param
        this(name, sal, "https://www.facebook.com/");
    }

    public User(String name, int sal, String addr) {
        this.userName = name;
        this.userCode = sal;
        this.webUrl = addr;
    }

    public static void main(String[] args) {
        User user = new User();
        user.disp();
    }

    private void disp() {
        System.out.println("User Name: " + userName);
        System.out.println("User Code: " + userCode);
        System.out.println("User Domain: " + webUrl);
    }
}
