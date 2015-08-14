package homework1;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Box extends Things{
	

	public Box(int x, int y, int size) {
		super(x, y, size);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, size, size);
	}
	
}
