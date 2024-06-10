import java.util.Scanner;

public class uinput {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = a.nextLine();

        System.err.println("enter your password: ");
        String pass = a.nextLine();

        if(name.equals("Ajay") || name.equals("")) {
            if (pass.equals("admin")) {
            System.out.println("Authroised user");
        }
        else{
            System.out.println("Not authroised user");
        }
    }
    }
}
