package workshop06;
/**
 * 
 * @author admin
 * + ����ϱ� �ذ��� ��
 */
public class Test03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum =0;

		for(int i=num; i<=10; i++) {
			if(i%3==0 || i%5==0)
				continue;
			else {
				System.out.print(i);
				sum = sum + i;
			}
	
		}
		System.out.println();
		System.out.println("��� : "+sum);
	}

}
