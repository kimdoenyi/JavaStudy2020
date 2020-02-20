package test26;

public class DerivedTest extends BaseTest{
	String department = "홍보부";
	
	public void getDisplay() {
		super.getDisplay();
		System.out.println("부서 : "+department);
	}
	
	// main은 어디서 실행해도 상관무
	public static void main(String[] args) {
		BaseTest bt = new DerivedTest();
		bt.getDisplay();
	}
}
