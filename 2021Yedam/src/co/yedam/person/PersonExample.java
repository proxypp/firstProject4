package co.yedam.person;



public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// p1 => �̸�, Ű, ������, ������
			//p2, p3
			//family => �������� (�̸�,������,����) ��1.
			// family => Ű�� 165�̻� ������ ���(�̸�, Ű ������) : ��2.
			
			//p3 => AB�� ����.
			//family => �������� AB���� ������ ��� (�̸�, ������): ��3.
			Person p1 = new Person();
			p1.setName("������");
			p1.setKey(160);
			p1.setWeight(50);
			p1.setBlood("AB");
			p1.setAge(20);
			
			Person s1 = new Person("��ź", 170, 65, "AB", 28 );
			
			Person p4 = new Person();
			p4.addPerson(s1);
			p4.showInfo();
			
			
			
			Person p2 = new Person("ȫ�浿", 176, 69, "A", 27);
			Person p3 = new Person("�鿹��", 164, 58, "B", 25);
			
			
			
			
			
			
			Person[] family = { p1, p2, p3};
			for(Person person : family ) {
				System.out.println("�̸�:" +person.getName() + " ������: "+ person.getBlood() + " ����: " + person.getAge());
			}
			System.out.println("��1.");
			System.out.println();
			
			for(Person person : family ) {
				if(person.getKey() >= 165) {
				System.out.println("�̸�:" +person.getName() + " Ű: "+ person.getKey() );
				}
				}
			System.out.println("��2.");
			System.out.println();
			
			for(Person person : family ) {
				if(person.getBlood() == "AB") {
				System.out.println("�̸�:" +person.getName() + " ������: "+ person.getBlood());
				}
				}
			
			System.out.println("��3.");
			System.out.println();
			
			
			
			
			
	}

}
