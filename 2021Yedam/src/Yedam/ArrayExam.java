package Yedam;

public class ArrayExam {
	public static void main(String[] args) {
		int[] intAry = {1,2,3};
		String[] strAry = {"Hello","World"};
				int num=10;
				
				int score;
				Student s1 = new Student();
				s1.name = "ȫ�浿";
				s1.score = 80;
				
				Student s2 = new Student();
				s2.name = "��μ�";
				s2.score = 90;
				
				System.out.println("s1�л��̸�:" +s1.name);
				System.out.println("s1�л��̸�:" +s1.name);
				
				Student s3= new Student();
				s3.name = "������";
				s3.score = 85;
				Student[] students = {s1,s2,s3};	
//				System.out.println("�迭ù��° �̸�: " + student[0].name);
//				System.out.println("�迭ù��° ����: " + student[0].score);
				
//				System.out.println("�迭����° �̸�: " +student[2].name);
//				System.out.println("�迭����° ����: " +student[2].score);
			
				s1.name = "�ڱ浿";
				s1.score = 70;
				for (int i=0; i<students.length; i++) {
//					System.out.println("�л��̸�: " name);
//					System.out.println("�л�����: "+ score);
				}
				
	}
}
