package homework1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JComponent;

import org.w3c.dom.css.RGBColor;

public class Circle extends Things{
	
	

	
	public Circle(int x, int y, int size) {
		super(x, y, size);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}

}
