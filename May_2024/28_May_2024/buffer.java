import java.io.*;
public class buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        // String name = br.readLine();
        // System.out.println("enter your age:"+name);
        String age = br.readLine();
        int age1 = Integer.parseInt(br.readLine());
        System.out.println("enter your age:"+age);
        }
}
