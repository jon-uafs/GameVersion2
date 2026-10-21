package game;
import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject{
	
	int size_;
	Color color_;
	
	public Block() 
	{
		this.size_ = 0;
		this.color_ = Color.gray;
	}
	
	public Block(String id, int x, int y, int speed, int direction, int size, Color color) 
	{
		super(id,x,y,speed,direction);
		this.size_ = size;
		this.color_ = color;
	}
	
	@Override
	public void update() 
	{
		this.y_ = this.y_ + this.speed_;
		if(this.y_ > 600) 
		{
			this.y_ = -100;
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(this.color_);
		g.fillRect(this.x_, this.y_, this.size_, this.size_);
		
	}

}
