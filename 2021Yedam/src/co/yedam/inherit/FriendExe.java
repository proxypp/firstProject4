package co.yedam.inherit;

import Yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��, ȸ��ģ�� = > �迭�� ����.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "111-1211");
		friends[5] = new Friend("ȫ�浿", "1111-1234");
		friends[1] = new Friend("���浿", "222-1211");
		friends[2] = new Friend("��浿", "333-1211");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new compFriend("��ö��", "2222-1212", "������");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("---------------------");
			System.out.println("1.ģ�� 2. ��ȸ 3.���� 4. ���� 5. ����");
			System.out.println("---------------------");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���."); // �ν��Ͻ� �޸� �Ҵ�. -> static

			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();

			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				reMove();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("��.");
	}

	private void addFriend() {
		// ģ��, �б�ģ��, ȸ��ģ�� �� ��������� ���� �䱸�Ǵ� ���� �޶���.
		System.out.println("1. ģ�� 2. �б�ģ�� 3. ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴��� ����");

		String name = ScanUtil.readStr("ģ���̸� �Է�");
		String phone = ScanUtil.readStr("����ó�� �Է�");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);
		} else if (choice == 2) {
			String major = ScanUtil.readStr("�����Է�");
			friend = new UnivFriend(name, phone, major);
		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��Է�");
			friend = new compFriend(name, phone, depart);

		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("��� ����.");

	}
//	private void showList() {
	// �̸�, ����ó �Է� => ȫ�浿, ��浿-> "�浿"
	// ����ó 1111-1211, 2222-1211 - > "1211" ��ȸ.
	// �浿, 1211 -> �̸� & ����ó.
	/*
	 * 1. �̸��� �Է��� �޴���, ����ȣ�� �Է��� �޴���, �Ѵ� �Է��� �޴����� �Ǵ�. 2. ���� : �� �� �Է��� �ȹ޴� ���. -> ��
	 * ��쿡�� �ٽ� �Է� �޵��� ����� ��� �ؿ�.
	 * 
	 * A.equals(B) == true : ���ڿ� A�� B�� �����ϴ�. == false : ���ڿ� A�� B�� �ٸ��ϴ�.
	 */

//		String name, phone;
//		while (true) {
//			name = ScanUtil.readStr("ģ���̸� �Է�"); // ""
//			phone = ScanUtil.readStr("����ó�� �Է�");// "2222"

//			if (name.equals("") == true && phone.equals("") == true) {
//				System.out.println("�ٽ��Է��ϼ���.");
//			} else
//				break;

//		}
	// ���Ⱑ ����Ǵ� �������ʹ� ������ �� �� �ϳ��� �Է��� �޾Ҵٶ�� ���� �ǹ�.
	// ã�� ���� �Ȱ���
	/*
	 * 1. �� �� �Է��� �޾Ҵ��� 2. �� ��ȣ�� �Է��� �޾Ҵ��� 3. �̸��� �Է��� �޾Ҵ��� �̰Ÿ� if else������ �����ָ��.
	 * 
	 * ���ڿ� A.indexof(���ڿ�B) = C : ���ڿ� A���� ���ڿ� B�� �����ϴ� ù �ε��� ��ȣ�� C�Դϴ�. ���� ������� -1�̶��
	 * ���� A���ڿ� �ȿ� B��� ���ڿ��� ���ٶ�� �ſ���. ȫ�浿 ȫ�浿.indexof(�浿) = 1 return. ȫ�浿.indexof(ö��)
	 * = -1 return. ȫ�浿.indexof(ȫ�浿) = 0 �� return
	 * 
	 * equals��� �޼ҵ�� �츮�� �𸣰� ������, ��� ��ģ���� true�� false �� �� �ϳ��� return ���ִ� �޼ҵ忡��.
	 * A.equals(B) �갡 A�� B�� ���� = true, �ٸ��ٸ� false return�����. -1�� �ƴ϶�� ���� ȫ�浿 �ȿ� ��򰡿�
	 * �� ���ڿ��� �ִٶ�� ���� �ǹ�.
	 * 
	 * if(name.equals(""))
	 */

//		for (int i = 0; i < friends.length; i++) {
//		if (friends[i] != null) {
//				if (name.equals("") == false && phone.equals("") == false) {
//					// �� �� �Է��� ���� ���.
//					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				} else if (name.equals("") == true && phone.equals("") == false) {
//					// �� ��쿡�� �� ��ȣ�� �Է��� ���� ���/.
//					if ( friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//					
//				} else if (name.equals("") == false && phone.equals("") == true) {
//					// �� ��쿡�� �̸��� �Է��� ���� ���.
//					if ( friends[i].getName().indexOf(name) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				}
//			}
//
//		}

//	}
	private void showList() {
		String name = ScanUtil.readStr("ģ���̸� �Է�"); // ""
		String phone = ScanUtil.readStr("����ó�� �Է�");// "2222"

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (!name.equals("") && !phone.equals("")) {
					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1)
						System.out.println(friends[i].toString());
				} else if (!phone.equals("")) {
					if (friends[i].getPhone().indexOf(phone) != -1) {
						System.out.println(friends[i].toString());
					}
				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1)
						System.out.println(friends[i].toString());

				} else {
					System.out.println(friends[i].toString());
				}

			}
		}
	}

	private void modify() {
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("ģ���� �����ϼ���.");
		String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���.");
		if (!phone.equals(""))
			friends[num].setPhone(phone);

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���.");
			if (!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);

		} else if (friends[num] instanceof compFriend) {
			String depart = ScanUtil.readStr("�ٲܺμ��� �Է��ϼ���.");
			if (!depart.equals(""))
				((compFriend) friends[num]).setDepart(depart);

		}
		System.out.println("�����Ϸ�.");
	}

	private void reMove() {
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ģ���� �����ϼ���.");
		if (friends[num] != null) {
			friends[num] = null;
			System.out.println("�����Ϸ�.");

		} else {
			System.out.println("������ ������ �����ϴ�.");
		}

	}
}
