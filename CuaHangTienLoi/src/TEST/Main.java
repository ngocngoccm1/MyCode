/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST;


import static Connection.QLSanPham.findAllSP;
import SanPham.SanPham;
import java.util.List;

/**
 *
 * @author Noc
 */
public class Main {
    public static void main(String[] args) {
        List<SanPham> a = findAllSP();
        for (int i = 0; i < a.size(); i++) {
            a.get(i).show();
        }
}
}
