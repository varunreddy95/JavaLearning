package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        
        try {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");

            PreparedStatement stm = con.prepareStatement("select * from students where deptno=?");  

            //User input for department number
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Department Number: ");
            int dno = sc.nextInt();

            stm.setInt(1, dno);

            //Retrieving records where 
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
                                       rs.getString(3) + " " + rs.getInt(4));
            }

            stm.close();
            con.close();
            sc.close();
        } catch (ClassNotFoundException | SQLException e) {System.out.println(e);}
    }
}
