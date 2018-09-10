
public class Player extends Circle implements Moveable{

	public Player(int radius, double x, double y) {
		
		super(radius, x, y);
		
	}
	
	public void moveUp() {
		
		this.boundingBox.setY(this.y-1);
		
	}
	
	public void moveDown() {
		
		this.boundingBox.setY(this.y+1);
		
	}
	
	public void moveRight() {
		
		this.boundingBox.setX(this.x+1);
	
	}
	
	public void moveLeft() {
		
		this.BoundingBox.setX(this.x-1);
		
	}

	
}
