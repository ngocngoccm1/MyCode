
package Digital_Clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Digital_Clock implements Runnable{
    JFrame f;
    Thread t =null;
    int h=0,m=0,s=0;
    String timeName = "";
    JButton b;
    Digital_Clock()
    {
        f=new JFrame();
        t=new Thread(this);
        t.start();
        b= new JButton();
        b.setBounds(100, 100, 100, 50);
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public void run()
    {
        try
        {
            while (true) {                
                Calendar cal = Calendar.getInstance();
                h = cal.get(Calendar.HOUR_OF_DAY);
                if ( h > 12 ) h -= 12;  
                m = cal.get(Calendar.MINUTE);
                s = cal.get(Calendar.SECOND);
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                Date date = cal.getTime();  
                timeName = formatter.format( date );  
                printTime();  
                t.sleep( 1000 );
            }
        }catch(Exception e){}
    }
    public void printTime(){  
        b.setText(timeName);  
}  
    public static void main(String[] args) {  
        new Digital_Clock();  

}  
}
