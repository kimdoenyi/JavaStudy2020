package test27;

public class CircleRound extends Circle{
	
	public CircleRound(int r) {
		super(r);
	}
	
	public void compute() {
		size = r * 2 * PI;
	}
	public void output() {
		System.out.println("원의 둘레 : "+size);
	}
	
	public static void main(String[] args) {
		CircleArea ob1 = new CircleArea(10);
		CircleRound ob2 = new CircleRound(10);
		ob1.compute();
		ob1.output();
		ob2.compute();
		ob2.output();
	}
}
