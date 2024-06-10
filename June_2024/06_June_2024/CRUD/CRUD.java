public class CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

//		Connection establish
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
        System.out.println("Connected "+ conn);
    }
}
