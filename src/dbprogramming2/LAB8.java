/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming2;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author 47643
 */
public class LAB8 {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Collection-2021";
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM student";
        ResultSet results = statement.executeQuery(sql);
        while(results.next()){
            System.out.println(results.getString(1)+""+results.getString(2)+""+results.getString(3)+""+results.getString(4)+""+results.getString(5));
        }
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Dbprogramming2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
