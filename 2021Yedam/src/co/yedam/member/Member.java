package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱�
	private String memberId;
	private String name;
	private String address;
	
	//������ : �ʵ忡 ���� �ʱ�ȭ. ����̴�
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
	
	//�޼ҵ�
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
	//�޼ҵ�
	public void showInfo() {
		System.out.println("���̵�: " + memberId);
		System.out.println("�̸�: " + name);
		System.out.println("�ּ�: " + address);
	}

	public void showMemberId() {
		System.out.println("���̵�: " + memberId);
	}

	public void showName() {
		System.out.println("�̸�: "+ name);
	}

	public void showAddress() {
		System.out.println("�ּ�: " + address);
	}
}
