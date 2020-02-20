package account;

public class Account {
	private String account;	// ���¹�ȣ
	private int balance;	// �ܾ�	
	private double interestRate;	// ����
	
	public Account() {
		super();
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (double)balance * (interestRate/100);
	}
	
	public void deposit(int money) {
		setBalance(balance+money);
	}
	public void withdraw(int money) {
		if(balance-money < 0)
			System.out.println("����� �� �� �����ϴ�.");
		else
			setBalance(balance-money);
	}
	
	public void accountInfo() {
		System.out.println("���¹�ȣ: "+getAccount()+" �ܾ�: "+getBalance()+"��"+" ������: "+getInterestRate()+"%");
	}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
