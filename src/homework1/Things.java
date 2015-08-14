package homework1;

import java.awt.Color;
import java.awt.Graphics;

abstract class Things {

	Color color;
	int size;
	int x, dx;
	int y, dy;

	public Things(int x, int y, int size) {

		color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
		dx = (int) (Math.random() * 3) + 1;
		dy = (int) (Math.random() * 3) + 1;
		this.x = x;
		this.y = y;
		this.size = size;
	}

	abstract void paint(Graphics g);

	public void move(int weight, int height) {

		if (x <= 0 || x >= weight-size)
			dx *= -1;
		if (y < 0 || y >= height-size)
			dy *= -1;

		x += dx;
		y += dy;
	}

}
