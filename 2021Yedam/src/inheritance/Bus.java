package inheritance;

import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	
	public Bus() {
		super();
	}
	
	@Override
	protected void run() {
		// TODO Auto-generated method stub
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	
}

