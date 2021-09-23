package co.yedam.person;


/*
 * �̸�, Ű, ������, ������, ����
 */
public class Person {
	private String name;
	private double key;
	private int weight;
	private String blood;
	private int age;
	private Person[] ddd;
	
	public Person() {
		ddd = new Person[5];
	}
	
	public Person(String name, double key, int weight, String blood, int age) {
		
		this.name = name;
		this.key = key;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKey() {
		return key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void addPerson(Person ppp) {
		for (int i = 0; i < ddd.length; i++) {
			if (ddd[i] == null) {
				ddd[i] = ppp;
				break;
			}
		}
	}
	
	
	public void showInfo() {
		for (int i = 0; i < ddd.length; i++) {
			if (ddd[i]!=null) {
				System.out.println("�̸�: " + ddd[i].getName() + " Ű: " + ddd[i].getKey() + " ������: " + ddd[i].getWeight() + " ������: " + ddd[i].getBlood()
						+ " ����: " + ddd[i].getAge());
			}
		}

	}
	
}


	

