package shape;

public class Triangle extends Shape implements Resize{
	
	public Triangle() {
		super();
	}
	
	public Triangle(int width, int height, String colors) {
		 super.setWidth(width);
		 super.setHeight(height);
		 super.setColors(colors);
	}
	
	public double getArea() {
		return super.getWidth() * super.getHeight() / 2.0;
	}
	
	public void setResize(int size) {
		super.setHeight(super.getHeight()+size);
	}
	
}
