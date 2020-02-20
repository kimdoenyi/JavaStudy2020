package shape;
/**
 * 
 * @author admin
 * 추상 클래스는 객체 생성 불가능 !!!
 */
public abstract class Shape {
	
	private int width;
	private int height;
	private String colors;
	
	public Shape() {
		super();
	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	// 넓이 구하기
	public double getArea() {
		return 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	
}
