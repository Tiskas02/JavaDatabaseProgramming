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
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author 47643
 */
public class LAB15 {
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
        ResultSetMetaData rsMetaData = results.getMetaData();
        for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
        System.out.printf("%-15s \t",rsMetaData.getColumnName(i));
        }
        System.out.println();
        while(results.next()){
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
            System.out.printf("%-15s \t",results.getString(i));
            }
            System.out.println();
        }
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Dbprogramming2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
