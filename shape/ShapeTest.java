package shape;
/**
 * 
 * @author admin
 * 1. �������� Shape type�� ��ü�� �����϶�� �ߴµ� Shape�� �߻�Ŭ�����ε�
 * 	   ��ü�� ������ �� �ִ°�
 * 2. 36 ~ 37���� ���� Ŭ�������� ����� �Լ��ε� ��  �迭�� �ѹ��� ó�� ���ϳ�
 * (�ذ�) setResize�� ShapeŸ���� �޼ҵ尡 �ƴ�. �迭�� ShapeŸ������ ���������
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
	
		System.out.println("�⺻����");
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
		
		System.out.println("\n����� ���� �� ����");
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
