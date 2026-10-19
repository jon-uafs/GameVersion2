package game;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
	int size_;
	Color color_;
	
	public Ball() 
	{
		this.size_ = 0;
		this.color_ = Color.gray;
	}
	
	public Ball(String id, int x, int y, int speed, int direction, int size, Color color) 
	{
		super(id,x,y,speed,direction);
		this.size_ = size;
		this.color_ = color;
	}
	
	@Override
	public void update() {
		this.x_ = this.direction_ + this.speed_;
		
		if(x_ > 600) 
		{
			this.x_ = -100;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(this.color_);
		g.fillOval(this.x_, this.y_, this.size_, this.size_);
		
	}
	
	@Override
	public void show() 
	{
		super.show();
		System.out.println("Size: " + this.size_);
		System.out.println("Color: " + this.color_.toString());
	}
	
	

}
