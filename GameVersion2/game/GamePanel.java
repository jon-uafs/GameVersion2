package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable{
	
	Ball ball;
	Block block;
	Dimension dim;
	
	
	public GamePanel(Dimension dim) 
	{
		this.setSize(dim);
		this.setBackground(Color.black);
		ball = new Ball("Ball1",100,100,20,1,50,Color.red);
		block = new Block("Block1",400,100,25,1,100,Color.blue);
		this.setIgnoreRepaint(true);
	}
	
	public void update() 
	{
		ball.update();
		block.update();
		
	}
	
	public void render(Graphics g) 
	{
		ball.render(g);
		block.render(g);
	}
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		this.render(g);
		Toolkit.getDefaultToolkit().sync();
	}
	
	
	@Override
	public void run() {
		
		while(true) 
		{
			this.update();
			this.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
