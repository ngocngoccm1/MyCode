package Book;

public class NhaSanXuat {
   private String maNhaSanXuat;
   private String tenNhaSanXuat;
   public NhaSanXuat(String maNhaSanXuat,String tenNhaSanXuat)
   {
      this.maNhaSanXuat = maNhaSanXuat;      
      this.tenNhaSanXuat = tenNhaSanXuat;

   }
   public void ThongTinNhaSanXuat()
   {
      System.out.println("Ma nha san xuat : "+maNhaSanXuat);
      System.out.println("Ten nha san xuat : "+tenNhaSanXuat);
   }
}