package co.yedam.member;

import Yedam.Student;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("user1", "박미림", "대구 중구 내일동");
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "중구 남일동";
		m1.setAddress("중구 남일동");
		
//		System.out.println("아이디: " +m1.memberId);
		System.out.println("아이디: " +m1.getMemberId());
//		System.out.println("이름: " +m1.name);
		System.out.println("이름: " +m1.getName());
//		System.out.println("주소: " +m1.address);
		System.out.println("주소: " +m1.getAddress());
		
		
		Member m2 = new Member("user2");
		m2.showInfo();
		m2.setMemberId("proxypp");
		m2.setName("김영오");
		m2.setAddress("대구 서구 원대동");
		
		System.out.println("아이디: " +m2.getMemberId());
		System.out.println("이름: " +m2.getName());
		System.out.println("주소: " +m2.getAddress());
		
		
		Member m3 = new Member("user3", "홍길동", "대구 서구 신당동");
		m3.showInfo();
//		m3.name = "박길동";
		m3.setName("박길동");
		m3.showInfo();
		 
		Student s1 = new Student();
	// default	s1.name = "Hong";
	// default	s1.score = 90;
		
	}

}
