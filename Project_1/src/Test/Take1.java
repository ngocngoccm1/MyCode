/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Noc
 */
public class Take1 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
        Take1 t1 = new Take1();
        Take1 t2 = new Take1();
        t1.start();
    }
}
