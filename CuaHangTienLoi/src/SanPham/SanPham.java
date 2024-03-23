/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SanPham;

/**
 *
 * @author Noc
 */
public class SanPham {
    private int idSanPham;
    private String TenSanPhamString;
    private float Gia;

    public SanPham(int idSanPham, String TenSanPhamString, float Gia) {
        this.idSanPham = idSanPham;
        this.TenSanPhamString = TenSanPhamString;
        this.Gia = Gia;
    }

    public SanPham(String TenSanPhamString, float Gia) {
        this.TenSanPhamString = TenSanPhamString;
        this.Gia = Gia;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPhamString() {
        return TenSanPhamString;
    }

    public void setTenSanPhamString(String TenSanPhamString) {
        this.TenSanPhamString = TenSanPhamString;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    public void show()
    {
        System.out.println(getIdSanPham()+" : "+ getTenSanPhamString()+"  Gia: "+getGia());
    }
            
}
