package test27;
/**
 * 
 * @author admin
 * ! 부모 클래스의 변수도 자식 클래스가 쓸 수 있다 !
 * 
 */
public class Circle {
	int r;
	double size;	// 넓이와 둘레 변수
	final double PI = 3.141592;
	
	// 생성자
	public Circle(int r)	{
		super();
		this.r = r;
	}
	
	public void compute() {
	}
	
	public void output() {
	}
}
