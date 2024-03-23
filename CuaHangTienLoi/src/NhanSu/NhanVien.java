/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanSu;

/**
 *
 * @author Noc
 */
public class NhanVien {
    private int MaNv;
    private String TenNv;
    private String STD;
    private int NamSinh;

    public NhanVien(int MaNv, String TenNv, String STD, int NamSinh) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.STD = STD;
        this.NamSinh = NamSinh;
    }

    public NhanVien(int MaNv, String TenNv) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
    }

    public int getMaNv() {
        return MaNv;
    }

    public void setMaNv(int MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public String getSTD() {
        return STD;
    }

    public void setSTD(String STD) {
        this.STD = STD;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }
            
         
}
