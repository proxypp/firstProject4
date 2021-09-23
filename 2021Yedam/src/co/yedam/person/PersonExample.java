package co.yedam.person;



public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// p1 => 이름, 키, 몸무게, 혈액형
			//p2, p3
			//family => 가족정보 (이름,혈액형,나이) 끝1.
			// family => 키가 165이상 가족만 출력(이름, 키 몸무게) : 끝2.
			
			//p3 => AB로 번경.
			//family => 혈액형이 AB형인 가족만 출력 (이름, 혈액형): 끝3.
			Person p1 = new Person();
			p1.setName("남차장");
			p1.setKey(160);
			p1.setWeight(50);
			p1.setBlood("AB");
			p1.setAge(20);
			
			Person s1 = new Person("송탄", 170, 65, "AB", 28 );
			
			Person p4 = new Person();
			p4.addPerson(s1);
			p4.showInfo();
			
			
			
			Person p2 = new Person("홍길동", 176, 69, "A", 27);
			Person p3 = new Person("백예린", 164, 58, "B", 25);
			
			
			
			
			
			
			Person[] family = { p1, p2, p3};
			for(Person person : family ) {
				System.out.println("이름:" +person.getName() + " 혈액형: "+ person.getBlood() + " 나이: " + person.getAge());
			}
			System.out.println("끝1.");
			System.out.println();
			
			for(Person person : family ) {
				if(person.getKey() >= 165) {
				System.out.println("이름:" +person.getName() + " 키: "+ person.getKey() );
				}
				}
			System.out.println("끝2.");
			System.out.println();
			
			for(Person person : family ) {
				if(person.getBlood() == "AB") {
				System.out.println("이름:" +person.getName() + " 혈액형: "+ person.getBlood());
				}
				}
			
			System.out.println("끝3.");
			System.out.println();
			
			
			
			
			
	}

}
