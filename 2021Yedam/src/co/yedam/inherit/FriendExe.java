package co.yedam.inherit;

import Yedam.ScanUtil;

public class FriendExe {
	
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;
	private FriendExe () {
		// 친구, 학교친구, 회사친구 = > 배열에 저장.
		// CompFriend -> Friend, UnivFriend -> Friend 
		Friend[] friends = new Friend[100];
	}
	
	public static FriendExe getInstance() {
		return singleton;
	}
	
	

	public void execute() {
		while (true) {
		System.out.println("---------------------");
		System.out.println("1.친구 2. 조회 3.수정 4. 삭제 5. 종료");
		System.out.println("---------------------");
		int menu = ScanUtil.readInt("메뉴를 선택하세요."); // 인스턴스 메모리 할당. -> static
		
			if (menu == 1) {
				System.out.println("등록");
				addFriend(); 
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
				
			} else if (menu == 3) {
				System.out.println("수정");
			} else if (menu == 4) {
				System.out.println("삭제");
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("끝.");
	}
	private void addFriend() {
		// 친구, 학교친구, 회사친구 를 등록할지에 따라 요구되는 값이 달라짐.
		System.out.println("1. 친구 2. 학교친구 3. 회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택");
		
		String name = ScanUtil.readStr("친구이름 입력");
		String phone = ScanUtil.readStr("연락처를 입력");
		Friend friend = null;
		if (choice == 1) {
				friend = new Friend(name, phone);
		}else if (choice == 2) {
			String major = ScanUtil.readStr("전공입력");
			 friend = new UnivFriend(name, phone, major);
		}else if (choice == 3) {
			String depart = ScanUtil.readStr("부서입력");
			 friend = new compFriend(name, phone, depart);
			
			
		}
		for(int i=0; i <friends.length; i++){
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
	}
		System.out.println("등록 성공.");
		
	}
	private void showList() {
		for (int i=0; i<friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
	}
	
	
}
