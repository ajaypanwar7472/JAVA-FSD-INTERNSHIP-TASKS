// 8. Create a custom exception InvalidAgeException that includes the invalid age value as additional data. Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).

import java.util.Scanner;
class InvalidAgeException extends Exception {
    private int invalidAge;

    public InvalidAgeException(int invalidAge) {
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
public class AgeValidator {
    public static void main(String[] args) {
        try {
            System.out.println("Enter your age:");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getInvalidAge());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException(age);
        }
    }
}