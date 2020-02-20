package shape;

public class Rectangle extends Shape implements Resize{
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height, String colors) {
		super.setWidth(width);
		super.setHeight(height);
		super.setColors(colors);
	}
	
	public double getArea() {
		return super.getWidth() * super.getHeight();
	}
	
	public void setResize(int size) {
		super.setWidth(super.getWidth()+size);
	}
}
