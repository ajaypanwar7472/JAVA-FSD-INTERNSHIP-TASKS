// 6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException. 
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an index to access:");
        int index = scanner.nextInt();

        try {
            System.out.println("The value at index " + index + " is: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}