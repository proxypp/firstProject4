package co.yedam.inherit;

public class Vehicle {
	
	protected Vehicle() {
		
	}
	
	public Vehicle(String msg) {
		System.out.println(">>"+msg);
	}
	
	protected void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	public void stop () {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
}
