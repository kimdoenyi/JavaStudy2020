package shape;
/**
 * 
 * @author admin
 * 1. 문제에서 Shape type의 객체를 생성하라고 했는데 Shape은 추상클래스인데
 * 	   객체를 생성할 수 있는가
 * 2. 36 ~ 37번줄 각각 클래스에서 선언된 함수인데 왜  배열로 한번에 처리 못하나
 * (해결) setResize가 Shape타입의 메소드가 아님. 배열이 Shape타입으로 선언돼있음
 */
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
	
		System.out.println("기본정보");
		for(int i=0; i<shape.length; i++) {
			if(i % 2 == 0) {
				System.out.print("Triangle\t");
				System.out.print(shape[i].getArea()+"\t");
				System.out.print(shape[i].getColors()+"\n");
			} else {
				System.out.print("Rectangle\t");
				System.out.print(shape[i].getArea()+"\t");
				System.out.print(shape[i].getColors()+"\n");
			}
		}
	
		((Triangle) shape[0]).setResize(5);
		((Rectangle) shape[1]).setResize(5);
		((Triangle) shape[2]).setResize(5);
		((Rectangle)shape[3]).setResize(5);
		((Triangle)shape[4]).setResize(5);
		((Rectangle)shape[5]).setResize(5);
		
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i=0; i<shape.length; i++) {
			if(i % 2 == 0) {
				System.out.print("Triangle\t");
				System.out.print(shape[i].getArea()+"\t");
				System.out.print(shape[i].getColors()+"\n");
			} else {
				System.out.print("Rectangle\t");
				System.out.print(shape[i].getArea()+"\t");
				System.out.print(shape[i].getColors()+"\n");
			}
		}
		
	}


}
