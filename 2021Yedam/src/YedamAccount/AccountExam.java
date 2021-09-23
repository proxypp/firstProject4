package YedamAccount;

import java.util.Scanner;
/*
 * 1. ���»���, 2. ���¸��, 3.����, 4.���, 5.����
 * �� �޼ҵ带 �����ϼ���.
findAccount(String ano) �޼ҵ�� �Ա�, ��� �� ���¹�ȣ�� ã�� �� ����ϴ� �޼ҵ�� ����ϼ���.
 */

public class AccountExam {
	static int nums = 0;
	private static Account[] Aca = new Account[100];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.println("�����ϼ��� >>");

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
				System.out.println("�߸��� ���� �Է���.");
			}

		}
		System.out.println("����.");
	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("���»���.");
		System.out.println("-------------");

		String account = readStr("���¸� �Է��ϼ���.");
		sc.nextLine();
		String name = readStr("�̸��� �Է��ϼ���.");

		int money = readInt("�ݾ��� �Է��ϼ���.");

		Account act = new Account(account, name, money);
		for (int i = 0; i < Aca.length; i++) {
			if (Aca[i] == null) {
				Aca[i] = act;
				break;
			}
		}
		System.out.println("����Ϸ�.");
	}

	private static void accountList() {
		String search = readStr("��ȸ�� ����� �����ϼ���.");
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
		System.out.println("     ����");
		System.out.println("-------------");
		String nums = readStr("���¹�ȣ");
		sc.nextLine();
		int money = readInt("�Ա��� �ݾ��� �Է��ϼ���.");

		boolean isExist = false;
				if(findAccount(nums)!= null ) {
				int accplus = findAccount(nums).getMoney();
				findAccount(nums).setMoney(accplus+money);
				isExist = true;
				}
		if (isExist)
			System.out.println("���ݵǾ����ϴ�.");
		else
			System.out.println("���ݵ��� �ʾҽ��ϴ�.");
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("     ���");
		System.out.println("-------------");
		String nums = readStr("���¹�ȣ");
		sc.nextLine();
		int money = readInt("����� �ݾ��� �Է��ϼ���.");
		int accminus = findAccount(nums).getMoney();
		boolean isExist = false;
			if(findAccount(nums) != null) {
					if ( accminus >= money ) {
						findAccount(nums).setMoney(accminus-money);
						
						isExist = true;
					}
			}
		if (isExist)
			System.out.println("���������� ���.");
		else
			System.out.println("��ݵ��� �ʾҽ��ϴ�.");
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();

	}

	// ����� �Է°��� ��ȯ(int).
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;

		while (true) {
			String val = sc.nextLine();
			try {
				result = Integer.parseInt(val); // "1000" -> 1000
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		return result;
	}

}
