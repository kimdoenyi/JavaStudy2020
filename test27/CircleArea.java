package test27;

public class CircleArea extends Circle{
	
	public CircleArea(int r) {
		super(r);
	}
	
	public void compute() {
		size = this.r * this.r * PI;
	}
	public void output() {
		System.out.println("���� ���� : "+size);
	}
}
