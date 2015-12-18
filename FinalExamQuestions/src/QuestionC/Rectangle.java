package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
		
	}
	
	public void Rectangle(int newx, int newy) throws IllegalRectangle {
		
		if (newx <= 0 || newy <= 0) {
			
			throw new IllegalRectangle(newx, newy);
			}
	}
	

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
