import java.sql.*;
public class Main {
    public static void main(String[] args)  throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

//		Connection establish
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUDOP","root","");
        System.out.println("Connected "+ conn);

//        Show Databases

//	      ResultSet db = conn.createStatement().executeQuery("show databases");
//	      System.out.println("Databases :- " + db);
//	      System.out.println("\nAll Databases :- ");
//
//	      while(db.next()){
//	          System.out.println(db.getString(1));
//	      }

        //      Create Database
//
//      conn.createStatement().executeUpdate("CREATE DATABASE CRUDOP");
//      System.out.println("Database created");

        //      Create Table
//
//        String table = "CREATE TABLE STUDENTS(id INTEGER not NULL,name VARCHAR(255),email VARCHAR(255),age INTEGER,PRIMARY KEY ( id ))";
//        conn.createStatement().executeUpdate(table);
//        System.out.println("Created table in given database...");

        //      Insert data into the table
//
//      String data = "INSERT INTO Students VALUES (100, 'Ajay', 'Ajay@gmail.com', 20), (101, 'Keerti', 'Keerti@gmail.com', 18), (102, 'Shubham', 'Shub@gmail.com', 19), (103, 'Anuj', 'Anuj@gmail.com', 25), (104, 'Rohit', 'Rohit@gmail.com', 24)";
//      conn.createStatement().executeUpdate(data);
//      System.out.println("Inserted data in given table....");

        //      Update data into the table

//      String sql = "UPDATE Students SET name='Mohit', email='Mohit@gmail.com' WHERE id = 101";
//      conn.createStatement().executeUpdate(sql);
//      System.out.println("Updated data in given table....");

//        Retrieve all data

        String sql = "SELECT * FROM students";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        System.out.println("id\t\tname\t\temail\t\t\t\tage");

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String age = rs.getString("age");
            System.out.println(id+"\t\t"+name+"\t\t"+email+"\t\t"+age);
        }

    }
}