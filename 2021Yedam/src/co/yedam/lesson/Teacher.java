package co.yedam.lesson;
/*
 * �̸�, ����
 */
public class Teacher {
	//�ʵ�...
	
	private String name;
	private String major; 
	//������...
	//Teacher t1 = new Teacther(); => ��������°� �ν��Ͻ� ����.
	public Teacher (String name, String major) {
		 this.name = name;
		this.major = major;
	}
	//�޼ҵ�...
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName () {
		return this.name;
	}
	public String getMajor() {
		return this.major;
	}
}
