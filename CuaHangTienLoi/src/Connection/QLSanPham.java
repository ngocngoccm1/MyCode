/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author Noc
 */
import SanPham.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QLSanPham {
    public static List<SanPham> findAllSP() 
    {
    
    
        List<SanPham> list = new ArrayList<>();
        Connection conn = JDBCConnection.getJDBCConnection();
        String sql = "select * from sanpham";
        Statement s;
        try {
        s = conn.createStatement();
        ResultSet r = s.executeQuery(sql);
        while (r.next()) {                
                SanPham std = new SanPham(r.getInt("idSanPham"),
                        r.getString("TenSanpham"),r.getFloat("Gia"));
                list.add(std);
            } 
        }catch (SQLException ex) {
    }
        if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                   
                }
            }
        return list;
    }
    
    public static void insertSP(SanPham sp)
    {
        Connection conn = JDBCConnection.getJDBCConnection();
        String sql = "insert into sanpham(TenSanPham,Gia) values(?, ?)";
        
        try {
            PreparedStatement r =  conn.prepareCall(sql);
            r.setString(1, sp.getTenSanPhamString());
            r.setFloat(2, sp.getGia());
            r.execute();
        } catch (SQLException ex) {
            
        }
        if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                   
                }
            }
    }

}
