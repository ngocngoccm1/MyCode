/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BooksList {
     public static void main(String[] args) {
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/book?user=Noc&password=521346");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from book");

                while(rs.next()) {
                    System.out.println( rs.getString("Name"));
                }
                st.close();
                rs.close();
                con.close();
        } catch (Exception ex) {
                ex.printStackTrace();
        }
    }
}