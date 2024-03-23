
package Bar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;

public class Bar extends JPanel{
    private final int MARGIN = 1;
	private int x, y, width, value;
	private Color color;

	// y: the bottom left corner
	public Bar(int x, int y, int width, int value, Color color)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.value = value;
		this.color = color;
	}
       
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

        public Bar()
	{
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.value = 0;
		this.color = null;
	}
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
        }
        public void draw(Graphics g)
	{
                
		g.setColor(color);
		g.fillRect(x + MARGIN, y-value, width - MARGIN * 2, value);
	}
        public void SelectColor(Graphics g,Color color)
        {
            g.setColor(color);
            g.fillRect(x + MARGIN, y-value, width - MARGIN * 2, value);
        }
	public void clear(Graphics g)
	{
		// clear the space
		g.setColor(new Color(102, 102, 102));
		g.fillRect(x + MARGIN, y-value, width - MARGIN * 2, value);
	}

        public void swap(Bar a,Graphics g,int speed)
        {
                Bar temp = new Bar();
        	temp.value = this.value;
               
        	this.value = a.value;
                
                
              
        	a.value = temp.value;
               

        }
        public void comleteSort(Graphics g,Bar a,Bar b,int speed)
        {
            this.SelectColor(g,new Color(0, 75, 0));
            a.SelectColor(g,new Color(0, 75, 0));
            b.SelectColor(g,new Color(0, 75, 0));
            
            try {
			TimeUnit.MILLISECONDS.sleep(speed);
		} catch (Exception ex) {}
            this.draw(g);
            a.draw(g);
            b.draw(g);
        }
        
        public void insert(int value,Graphics g,int speed)
        {
            this.clear(g);
            
            this.value = value;
            this.SelectColor(g,Color.red);
            try {
			TimeUnit.MILLISECONDS.sleep(speed);
		} catch (Exception ex) {}
            this.draw(g);
        }
}
