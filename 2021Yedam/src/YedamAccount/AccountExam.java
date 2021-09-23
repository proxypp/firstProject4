package YedamAccount;

import java.util.Scanner;
/*
 * 1. 계좌생성, 2. 계좌목록, 3.예금, 4.출금, 5.종료
 * 각 메소드를 구현하세요.
findAccount(String ano) 메소드는 입금, 출금 시 계좌번호를 찾을 때 사용하는 메소드로 사용하세요.
 */

public class AccountExam {
	static int nums = 0;
	private static Account[] Aca = new Account[100];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택하세요 >>");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("잘못된 값을 입력함.");
			}

		}
		System.out.println("종료.");
	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성.");
		System.out.println("-------------");

		String account = readStr("계좌를 입력하세요.");
		sc.nextLine();
		String name = readStr("이름을 입력하세요.");

		int money = readInt("금액을 입력하세요.");

		Account act = new Account(account, name, money);
		for (int i = 0; i < Aca.length; i++) {
			if (Aca[i] == null) {
				Aca[i] = act;
				break;
			}
		}
		System.out.println("저장완료.");
	}

	private static void accountList() {
		String search = readStr("조회할 목록을 선택하세요.");
		for (Account act : Aca) {
			if (act != null && act.getName().indexOf(search) != -1)
				act.showInfo();
		}

	}

	public static Account findAccount(String nums) {
		for (int i = 0; i < Aca.length; i++) {
			if (Aca[i] != null && Aca[i].getNum().equals(nums)) {
				return Aca[i];
			}
	}
	return null;
	}

	private static void deposit() {
		System.out.println("-------------");
		System.out.println("     예금");
		System.out.println("-------------");
		String nums = readStr("계좌번호");
		sc.nextLine();
		int money = readInt("입금할 금액을 입력하세요.");

		boolean isExist = false;
				if(findAccount(nums)!= null ) {
				int accplus = findAccount(nums).getMoney();
				findAccount(nums).setMoney(accplus+money);
				isExist = true;
				}
		if (isExist)
			System.out.println("예금되었습니다.");
		else
			System.out.println("예금되지 않았습니다.");
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("     출금");
		System.out.println("-------------");
		String nums = readStr("계좌번호");
		sc.nextLine();
		int money = readInt("출금할 금액을 입력하세요.");
		int accminus = findAccount(nums).getMoney();
		boolean isExist = false;
			if(findAccount(nums) != null) {
					if ( accminus >= money ) {
						findAccount(nums).setMoney(accminus-money);
						
						isExist = true;
					}
			}
		if (isExist)
			System.out.println("정상적으로 출금.");
		else
			System.out.println("출금되지 않았습니다.");
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();

	}

	// 사용자 입력값을 반환(int).
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
