package co.yedam.friend;

import java.util.Scanner;



import co.yedam.kyobo.Book;

/*
 * 친구 목록 관리.
 * 이름, 연락처, email, 키, 몸무게.
 * 1.등록, 2.조회(이름), 3.목록, 4.수정, 5. 삭제, 9.종료
 * double val = Double.parseDouble("23.5");
 * scn.nextInt() -> int
scn.extDouble() -> double
scn.nextDouble()

 */

public class FriendMain {
	static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			Friend[] fri = new Friend[100];
			
			while(true){
				System.out.println("1.등록 2.조회 3.목록 4.수정 5.삭제 9.종료");
				int menu = readInt("메뉴를 선택하세요>>");
				if (menu==1) {
					System.out.println("연락처등록메뉴입니다.");
					String name = readStr("이름을 입력하세요.");
					int address = readInt("연락처를 입력하세요.");
					String email = readStr("email을 입력하세요.");
					int high = readInt("키를 입력하세요");
					int wei = readInt("몸무게를 입력하세요.");
					
					Friend friend = new Friend(name, address, email, high, wei);
					for(int i=0; i<fri.length; i++) {
						if (fri[i] == null) {
							fri[i] = friend;
							break;
						}
						
					}
					System.out.println("저장완료.");
				}if(menu==2) {
					System.out.println("연락처 조회 메뉴입니다.");
					String search = readStr("조회할 이름을 입력하세요.");
					for (Friend friend : fri) {
						if (friend != null && friend.getName().indexOf(search) != -1)
							friend.showInfo();
					}
					
				}if(menu==3) {
					for (Friend friend : fri) {
						if (friend != null) {
							friend.showInfo();

						}
					}
				}else if (menu == 4) {
					System.out.println("친구목록수정메뉴입니다.");
					String name = readStr("수정할 이름을 선택하세요.");
					String address = readStr("수정할 연락처를 입력하세요.[변경값을 입력하지않으려면 엔터]");
					String email = readStr("수정할 email을 입력[변경안할려면 엔터]");
					String high = readStr("수정할 키을 입력하세요.[변경안하려면 엔터]");
					String wei = readStr("수정할 몸무게를 입력하세요.[변경안하려면 엔터]");
					boolean isExist = false;
					for (int i = 0; i < fri.length; i++) {

						// 한건 찾아온 경우.
						if (fri[i] != null && fri[i].getName().equals(name)) {
							if (!address.equals("")) {
								fri[i].setAddress(Integer.parseInt(address));
							}
							if (!email.equals("")) {
								fri[i].setEmail(email);
							}
							if (!high.equals("")) {
								fri[i].setHigh(Integer.parseInt(high));
							}if (!wei.equals("")) {
								fri[i].setWei(Integer.parseInt(wei));
							}
							
							
							isExist = true;
						}

					}
					if (isExist)
						System.out.println("정상적으로 수정.");
					else
						System.out.println("등록되지 않았습니다.");
			
			}else if (menu == 5) {
				System.out.println("친구목록 삭제 메뉴입니다.");
				String search = readStr("삭제할 친구목록을 입력하세요.");
				for (int i = 0; i < fri.length; i++) {
					if (fri[i] != null && fri[i].getName().indexOf(search) != -1) {
						fri[i] = null;
					}
				}
				System.out.println("삭제완료.");
			} else if (menu == 9) {
				System.out.println("종료 메뉴입니다.");
				break;
			}
		} // end of while
		System.out.println("끝.");
				
	}	
	
		
		public static String readStr(String msg) {
			System.out.println(msg);
			return sc.nextLine();
			
		}
		public static int readInt(String msg) {
			System.out.println(msg);
			int result = 0;

			while (true) {
				String val = sc.nextLine();
				try {
					result = Integer.parseInt(val); // "1000" -> 1000
					break;
				} catch (Exception e) {
					System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
				}
			}
			return result;
		}
		
}
