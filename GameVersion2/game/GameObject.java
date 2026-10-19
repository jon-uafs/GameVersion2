package game;
import java.awt.Graphics;

public abstract class GameObject 
{
	protected String id_;
	protected int x_;
	protected int y_;
	protected int speed_;
	protected int direction_;
	
	public GameObject() 
	{
		this.id_ = "";
		this.x_ = 0;
		this.y_ = 0;
		this.speed_ = 0;
		this.direction_ = 0;		
	}
	
	public GameObject(String id, int x, int y, int speed, int direction) 
	{
		this.id_ = id;
		this.x_ = x;
		this.y_ = y;
		this.speed_ = speed;
		this.direction_ = direction;
	}
	
	public void show() 
	{
		System.out.println("ID: " + this.id_);
		System.out.println("X: " + this.x_);
		System.out.println("Y: " + this.y_);
		System.out.println("Speed: " + this.speed_);
		System.out.println("Direction: " + this.direction_);
	}
	
	public abstract void update();
	public abstract void render(Graphics g);
	

}
