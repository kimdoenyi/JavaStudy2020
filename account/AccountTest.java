package account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.print("��������: "+account.getAccount()+"  ");
		System.out.println("�����ܾ�: "+account.getBalance());
		
		account.withdraw(600000);
		account.deposit(20000);
		
		System.out.print("��������: "+account.getAccount()+"  ");
		System.out.println("�����ܾ�: "+account.getBalance());
		
		System.out.println("����: "+account.calculateInterest());
	}

}
