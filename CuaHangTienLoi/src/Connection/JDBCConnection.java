/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Noc
 */
public class JDBCConnection {
    public static Connection getJDBCConnection()
    {
        Connection con =null;
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/sanpham?user=Noc&password=521346");
                
        } catch (Exception ex) {
                ex.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
        Connection con = getJDBCConnection();
        try {
            Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from sanpham");

                while(rs.next()) {
                    System.out.println( rs.getString("idSanPham")+":"+rs.getString("TenSanpham")+rs.getString("Gia"));
                }
        } catch (Exception e) {
        }
    }
}
