package co.yedam.account;

public class Account {
	private String account;
	private String name;
	private int money;
	public Account(String account, String name, int money) {
		this.account = account;
		this.name = name;
		this.money = money;
	}
	public String getNum() {
		return account;
	}
	public void setNum(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
