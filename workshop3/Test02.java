package workshop3;
/**
 * 
 * @author admin
 * 
 * �ݺ����ȿ��� ������ �ʱ�ȭ�ϴ� �Ͱ�
 * ���������� �ʱ�ȭ�ϴ� ���� ����
 * 
 * ���������� ���������� ���� ������ �ִ� ������ ��Ȯ�ϰ� �� ��
 * 
 */

public class Test02 {
	// ���⼭ �����ϴ°� �ʵ� -> ��������
	// �ؿ� �����Լ����� �����ϴ°� �����Լ��� ���������� ��
	
	public static void main(String[] args) {
		//1���� 10���� �����
		int i=1;	// ��
		int j;	// ��
		/*
		 * �����������¿��� �ʱ�ȭ���Ǹ� while�ȿ��� ���� ������ ���Ǿ��� ��
		 * �ʱ�ȭ�� ���� ������ ��꿡 ������ ���� ���Ѵ�.
		 */
		
		while(i<10) {	//	 �ٱ� for��
			j=1;	// while�ٱ����� �ʱ�ȭ�ϸ� �� ����� �ٸ���(�ذ�)
			
			while(j<=i) {	// ���� for��
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	
	}

}