package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구 중구
	private String memberId;
	private String name;
	private String address;
	
	//생성자 : 필드에 값을 초기화. 기능이다
	public Member() {
	}
	
	public Member(String mId){	
		memberId = mId;
	}
	public Member(String mId, String n, String a){
		memberId = mId;
		name = n;
		address = a;
	}
	
	//메소드
	public void setMemberId(String mId) {
		memberId = mId;
		
		
	}
	public void setName(String n) {
		name = n;
		
	}
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	//메소드
	public void showInfo() {
		System.out.println("아이디: " + memberId);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
	}

	public void showMemberId() {
		System.out.println("아이디: " + memberId);
	}

	public void showName() {
		System.out.println("이름: "+ name);
	}

	public void showAddress() {
		System.out.println("주소: " + address);
	}
}
