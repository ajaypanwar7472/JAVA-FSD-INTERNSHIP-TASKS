// 7. Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException. 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class File_Read {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the file name:");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String fileName = scanner.nextLine();
            readFile(fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String data;
        while ((data = br.readLine())!= null) {
            System.out.println(data);
        }

        br.close();
    }
}