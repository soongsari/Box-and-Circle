package homework1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Board_GUI extends JFrame implements ActionListener{

		int x=0;
		
		JPanel panel;
		MyCanvas canvas = new MyCanvas();
		JTextField in_size;
		JComboBox<String> type = new JComboBox<>();
		ArrayList<Things> list = new ArrayList<>();
	
		JButton button = new JButton("add");
		JButton rm = new JButton("remove");
		
	public Board_GUI(){
		
		type.addItem("Box");
		type.addItem("Circle");
		
		this.setLayout(new FlowLayout());

		in_size = new JTextField(5);
			
		add(canvas);
		add(in_size);
		add(button);
		add(type);
		add(rm);
		
		in_size.addActionListener(this);
		rm.addActionListener(this);
		type.addActionListener(this);
		button.addActionListener(this);
		
		setSize(500, 400);
		setVisible(true);
		
		Thread thread = new Thread(canvas);
		thread.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==type){
			
			int size = Integer.parseInt(in_size.getText());
			canvas.setType((String)type.getSelectedItem(),size);
		}
		
		else if(e.getSource()==button){
			
			int size = Integer.parseInt(in_size.getText());
			
			if(type.getSelectedItem().equals("Box")){
				Box r = new Box(50,50,size);
				canvas.add(r);
			}
			else{ //¿ø ÀÏ¶§
				Circle c = new Circle(50,50,size);
				canvas.add(c);
			}
		}
		else if(e.getSource()==rm){
			canvas.remove();
		}
	}
}
