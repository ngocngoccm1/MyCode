package Book;

public class Sach {

    private int maSach;
    private String tenSach;
    private int soLuong;
    private float gia;
    private int namSanXuat;
    private String tacGia;

    public Sach(int maSach, String tenSach, int soLuong, float gia, int namSanXuat, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
        this.tacGia = tacGia;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach: " + maSach + ", tenSach: " + tenSach + ", soLuong :" + soLuong + ", gia :" + gia + ", namSanXuat :" + namSanXuat + ", tacGia :" + tacGia + '}';
    }
    public void ThongTinSach()
    {
        System.out.println(this.toString());
    }
}
