package co.yedam.friend;
/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게.
 */
public class Friend {
	private String name;
	private int address;
	private String email;
	private int high;
	private int wei;
	
	public Friend(String name, int address, String email, int high, int wei) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.high = high;
		this.wei = wei;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}
	public void showInfo () {
		System.out.printf("[이름: %s, 연락처: %d, email: %s, 키: %d, 몸무게: %d",
				name, address, email, high, wei);
	}

}
