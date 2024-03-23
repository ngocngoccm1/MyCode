package User;
import java.util.Date;
import java.awt.Image;
public class SinhVien {
    private String mssv;
    private String hoTen;
    private String lop;
    private String khoa;
    private Date ngaySinh;
    private String diaChi;
    private boolean gioTinh;
    private Image anh3x4;
    public void muonSach() {

    }
    public void ThongTinSinhVien()
   {
      System.out.println("Ma nhan vien : "+this.mssv);
      System.out.println("Ten : "+this.hoTen);      
      System.out.println("Lop : "+this.lop);     
      System.out.println("Khoa : "+this.khoa);
      System.out.println("Ngay sinh : "+this.ngaySinh);
      System.out.println("Dia chi : "+this.diaChi);
      System.out.println("Gioi tinh : "+this.gioTinh);
   }

}
