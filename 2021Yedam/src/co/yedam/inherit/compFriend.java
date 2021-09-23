package co.yedam.inherit;

public class compFriend extends Friend {
	public compFriend(String name, String phone) {
		super(name, phone);
		
	}

	private String depart;
	
	public compFriend (String name, String phone, String depart) {
		super(name, phone);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "compFriend [name=" + this.getName() +
				", phone=" + this.getPhone()
				+ "depart=" + depart + "]";
	}
	
}
