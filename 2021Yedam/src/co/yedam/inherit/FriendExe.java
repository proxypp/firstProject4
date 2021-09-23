package co.yedam.inherit;

import Yedam.ScanUtil;

public class FriendExe {
	
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;
	private FriendExe () {
		// ģ��, �б�ģ��, ȸ��ģ�� = > �迭�� ����.
		// CompFriend -> Friend, UnivFriend -> Friend 
		Friend[] friends = new Friend[100];
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
			} else if (menu == 4) {
				System.out.println("����");
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
		}else if (choice == 2) {
			String major = ScanUtil.readStr("�����Է�");
			 friend = new UnivFriend(name, phone, major);
		}else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��Է�");
			 friend = new compFriend(name, phone, depart);
			
			
		}
		for(int i=0; i <friends.length; i++){
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
	}
		System.out.println("��� ����.");
		
	}
	private void showList() {
		for (int i=0; i<friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
	}
	
	
}
