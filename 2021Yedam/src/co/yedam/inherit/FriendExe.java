package co.yedam.inherit;

import Yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구, 회사친구 = > 배열에 저장.
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "111-1211");
		friends[5] = new Friend("홍길동", "1111-1234");
		friends[1] = new Friend("정길동", "222-1211");
		friends[2] = new Friend("김길동", "333-1211");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new compFriend("김철수", "2222-1212", "영업부");
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
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				reMove();
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
		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공입력");
			friend = new UnivFriend(name, phone, major);
		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서입력");
			friend = new compFriend(name, phone, depart);

		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록 성공.");

	}
//	private void showList() {
	// 이름, 연락처 입력 => 홍길동, 김길동-> "길동"
	// 연락처 1111-1211, 2222-1211 - > "1211" 조회.
	// 길동, 1211 -> 이름 & 연락처.
	/*
	 * 1. 이름만 입력을 받는지, 폰번호만 입력을 받는지, 둘다 입력을 받는지를 판단. 2. 문제 : 둘 다 입력을 안받는 경우. -> 이
	 * 경우에는 다시 입력 받도록 만들어 줘야 해요.
	 * 
	 * A.equals(B) == true : 문자열 A와 B는 같습니다. == false : 문자열 A와 B는 다릅니다.
	 */

//		String name, phone;
//		while (true) {
//			name = ScanUtil.readStr("친구이름 입력"); // ""
//			phone = ScanUtil.readStr("연락처를 입력");// "2222"

//			if (name.equals("") == true && phone.equals("") == true) {
//				System.out.println("다시입력하세요.");
//			} else
//				break;

//		}
	// 여기가 실행되는 순간부터는 무조건 둘 중 하나는 입력을 받았다라는 것을 의미.
	// 찾을 때도 똑같음
	/*
	 * 1. 둘 다 입력을 받았는지 2. 폰 번호만 입력을 받았는지 3. 이름만 입력을 받았는지 이거를 if else문으로 나눠주면됨.
	 * 
	 * 문자열 A.indexof(문자열B) = C : 문자열 A에서 문자열 B가 시작하는 첫 인덱스 번호가 C입니다. 위의 결과값이 -1이라는
	 * 것은 A문자열 안에 B라는 문자열이 없다라는 거에요. 홍길동 홍길동.indexof(길동) = 1 return. 홍길동.indexof(철수)
	 * = -1 return. 홍길동.indexof(홍길동) = 0 이 return
	 * 
	 * equals라는 메소드는 우리는 모르고 쓰지만, 사실 이친구는 true나 false 둘 중 하나를 return 해주는 메소드에요.
	 * A.equals(B) 얘가 A랑 B가 같다 = true, 다르다면 false return해줘요. -1이 아니라는 것은 홍길동 안에 어딘가에
	 * 그 문자열이 있다라는 것을 의미.
	 * 
	 * if(name.equals(""))
	 */

//		for (int i = 0; i < friends.length; i++) {
//		if (friends[i] != null) {
//				if (name.equals("") == false && phone.equals("") == false) {
//					// 둘 다 입력을 받은 경우.
//					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				} else if (name.equals("") == true && phone.equals("") == false) {
//					// 이 경우에는 폰 번호가 입력을 받은 경우/.
//					if ( friends[i].getPhone().indexOf(phone) != -1) {
//						System.out.println(friends[i].toString());
//					}
//					
//				} else if (name.equals("") == false && phone.equals("") == true) {
//					// 이 경우에는 이름만 입력을 받은 경우.
//					if ( friends[i].getName().indexOf(name) != -1) {
//						System.out.println(friends[i].toString());
//					}
//				}
//			}
//
//		}

//	}
	private void showList() {
		String name = ScanUtil.readStr("친구이름 입력"); // ""
		String phone = ScanUtil.readStr("연락처를 입력");// "2222"

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
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("친구를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀 번호를 입력하세요.");
		if (!phone.equals(""))
			friends[num].setPhone(phone);

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요.");
			if (!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);

		} else if (friends[num] instanceof compFriend) {
			String depart = ScanUtil.readStr("바꿀부서를 입력하세요.");
			if (!depart.equals(""))
				((compFriend) friends[num]).setDepart(depart);

		}
		System.out.println("수정완료.");
	}

	private void reMove() {
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("삭제할친구를 선택하세요.");
		if (friends[num] != null) {
			friends[num] = null;
			System.out.println("삭제완료.");

		} else {
			System.out.println("삭제할 정보가 없습니다.");
		}

	}
}
