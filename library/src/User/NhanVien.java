package User;
public class NhanVien {
   private int maNV;
   private String hoTen;
   private String sdt;
   private String diaChi;
   private String cccd;
   private boolean gioiTinh;
   public NhanVien(int maNV,String hoTen,String sdt,String diaChi,String cccd,boolean gioiTinh)
   {
      this.maNV = maNV;      
      this.hoTen = hoTen;
      this.sdt = sdt;
      this.diaChi = diaChi;
      this.cccd = cccd;
      this.gioiTinh = gioiTinh;
   }
   public void ThongTinNhanVien()
   {
      System.out.println("Ma nhan vien : "+this.maNV);
      System.out.println("Ten : "+this.hoTen);      
      System.out.println("So dien thoai : "+this.sdt);     
      System.out.println("Dia chi : "+this.diaChi);
      System.out.println("Can cuoc cong dan : "+this.cccd);
      System.out.println("Gioi tinh : "+this.gioiTinh);
   }
   public void capNhatSach() {

   }
public static void main(String[] args) {
   NhanVien A = new NhanVien(0, "Ngoc", "0946061550", "Ca Mau", "099", true);
   A.ThongTinNhanVien();
}
}