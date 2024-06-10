import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = a.nextInt();

        if (age>=18) {
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}
