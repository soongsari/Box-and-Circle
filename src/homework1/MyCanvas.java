package homework1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import org.omg.CORBA.SetOverrideType;

public class MyCanvas extends Canvas implements Runnable,MouseListener{
	
	int size;
	int weight=450, height=300;
	ArrayList<Things> list = new ArrayList<>();
	String type = "Box";
	
	public MyCanvas(){
	
		this.setSize(weight, height);
		this.setBackground(Color.black);
		this.addMouseListener(this);
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void add(Things val){
		list.add(val);
	}
	
	public void remove(){
		if(list.size()>0)
			list.remove(0);
	}
	
	public void paint(Graphics g){
		
		for(int i=0;i<list.size();i++){
			Things temp = list.get(i);
			temp.paint(g);
			temp.move(weight,height);
		}
	}
	

	public void run(){
		
		while(true){
			repaint();
			
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setType(String type,int size){

		this.type=type;
		this.size=size;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(type.equals("Box")){
			Box r = new Box(x,y,size);
			list.add(r);
		}
		else{
			Circle c = new Circle(x,y,size);
			list.add(c);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
