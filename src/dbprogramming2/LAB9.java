/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming2;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author 47643
 */
public class LAB9 {
     public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Collection-2021";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO student (studentID,firstName,lastName,email,deptID)"+"VALUES ('651078','Saksit','Tatitrisakul','saksit.tati@mail.kmutt.com','IT')";
        statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Dbprogramming2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
