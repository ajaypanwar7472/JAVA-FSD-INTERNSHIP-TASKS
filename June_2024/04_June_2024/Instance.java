class student{
    String name;
    public void display(){
        System.out.println("Hello "+ name + "!");
    }
}


public class Instance{
    public static void main(String[] args) {
        int age = 24;
        String name = "Ajay";
        student a1 = new student();
        student a2 = new student();
        a1.name="Ajay";
        a1.display();
        a2.name="Ajay";
        a2.display();
    }
}