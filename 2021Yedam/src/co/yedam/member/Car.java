package co.yedam.member;

public class Car {
	//필드
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;  //허용된 범위값을 넘은 값이 들어오기때문에 제어해주기 위해 private 를쓴다.
	private Tire tire;
	
	// 생성자.
	
	public Car(String carName, String carModel, int carPrice, int maxSpeed, Tire tire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	//메소드. 
	public String getCarName() { 
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	// 타이어 : 
}
