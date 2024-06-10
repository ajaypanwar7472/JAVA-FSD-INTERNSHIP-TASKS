class students{
    String name="Ajay";
    String rollno="1234";
    int[] marks={88,44};
    String email="ajay@gmail.com";
    String hello="hello";

    public String display_name(){
        System.out.println("the student is called" +name);
        // return(id);
    }
}


public class classes {
    public static void main(String[] args) {
        // int a, b, c;
        students s1 = new students();
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks[1]);
        System.out.println(s1.email);

    }
}
