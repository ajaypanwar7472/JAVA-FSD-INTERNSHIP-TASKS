// 1. Write a java program to Append text or string in a file 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "example.txt"; // specify the file path
        String textToAppend = "Hello, world! This text will be appended to the file.";

        try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) {
            out.println(textToAppend);
            System.out.println("Text appended successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}