package Yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId= 10;
		m1.name= "�ڹ̸�";
		m1.phone =" 010-1111-2222";
		
		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "ȫ�浿";
		m2.phone = "010-3333-4444";
		
		Member [] members = {m1, m2};
		for (Member member : members) {
			System.out.println("���̵�:" + member.memberId);
			System.out.println("�̸�: + " +member.name);
			System.out.println("����ó: " + member.phone);

			
//			m1 ==> members[0]
			m1.name = "��̸�";
			members[0].phone  = "010-5555-6666";
			for (Member m : members) {
				System.out.println("���̵�:" +m.memberId);
				System.out.println("�̸�: + " +m.name);
				System.out.println("����ó: " +m.phone);
				member.showInfo();
		}	
		Student s1 = new Student();
		s1.name = "Hong";
		s1.score = 90;
		
	}
	}
}
