/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming2;
import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author 47643
 */
public class Dbprogramming2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url= "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Collection-2021";
        
      
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loded");
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("connected");
        Statement statement = connection.createStatement();
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dbprogramming2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Dbprogramming2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
