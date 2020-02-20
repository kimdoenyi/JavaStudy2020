package account;

public class Account {
	private String account;	// 계좌번호
	private int balance;	// 잔액	
	private double interestRate;	// 이율
	
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
			System.out.println("출금을 할 수 없습니다.");
		else
			setBalance(balance-money);
	}
	
	public void accountInfo() {
		System.out.println("계좌번호: "+getAccount()+" 잔액: "+getBalance()+"원"+" 이자율: "+getInterestRate()+"%");
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
