package test26;

public class DerivedTest extends BaseTest{
	String department = "ȫ����";
	
	public void getDisplay() {
		super.getDisplay();
		System.out.println("�μ� : "+department);
	}
	
	// main�� ��� �����ص� �����
	public static void main(String[] args) {
		BaseTest bt = new DerivedTest();
		bt.getDisplay();
	}
}
