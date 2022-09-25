package inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.username = "Ishan";

        i.login();
        i.scheduleClass();
        User u = new User();
        u.login();

//        u.scheduleClass(); // User class does not have scheduleClass method

        System.out.println(i.username);
    }
}
