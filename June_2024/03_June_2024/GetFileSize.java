// 3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes 
import java.io.File;
import java.text.DecimalFormat;

public class GetFileSize {
    public static void main(String[] args) {
        File file = new File("example.txt"); // specify the file path

        if (file.exists()) {
            long fileSize = file.length();
            double fileSizeKB = fileSize / 1024.0;
            double fileSizeMB = fileSizeKB / 1024.0;

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("File size in bytes: " + fileSize);
            System.out.println("File size in kilobytes: " + df.format(fileSizeKB));
            System.out.println("File size in megabytes: " + df.format(fileSizeMB));
        } else {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
    }
}