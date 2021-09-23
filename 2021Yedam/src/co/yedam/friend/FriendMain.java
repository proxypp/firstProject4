package co.yedam.friend;

import java.util.Scanner;



import co.yedam.kyobo.Book;

/*
 * ģ�� ��� ����.
 * �̸�, ����ó, email, Ű, ������.
 * 1.���, 2.��ȸ(�̸�), 3.���, 4.����, 5. ����, 9.����
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
				System.out.println("1.��� 2.��ȸ 3.��� 4.���� 5.���� 9.����");
				int menu = readInt("�޴��� �����ϼ���>>");
				if (menu==1) {
					System.out.println("����ó��ϸ޴��Դϴ�.");
					String name = readStr("�̸��� �Է��ϼ���.");
					int address = readInt("����ó�� �Է��ϼ���.");
					String email = readStr("email�� �Է��ϼ���.");
					int high = readInt("Ű�� �Է��ϼ���");
					int wei = readInt("�����Ը� �Է��ϼ���.");
					
					Friend friend = new Friend(name, address, email, high, wei);
					for(int i=0; i<fri.length; i++) {
						if (fri[i] == null) {
							fri[i] = friend;
							break;
						}
						
					}
					System.out.println("����Ϸ�.");
				}if(menu==2) {
					System.out.println("����ó ��ȸ �޴��Դϴ�.");
					String search = readStr("��ȸ�� �̸��� �Է��ϼ���.");
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
					System.out.println("ģ����ϼ����޴��Դϴ�.");
					String name = readStr("������ �̸��� �����ϼ���.");
					String address = readStr("������ ����ó�� �Է��ϼ���.[���氪�� �Է������������� ����]");
					String email = readStr("������ email�� �Է�[������ҷ��� ����]");
					String high = readStr("������ Ű�� �Է��ϼ���.[������Ϸ��� ����]");
					String wei = readStr("������ �����Ը� �Է��ϼ���.[������Ϸ��� ����]");
					boolean isExist = false;
					for (int i = 0; i < fri.length; i++) {

						// �Ѱ� ã�ƿ� ���.
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
						System.out.println("���������� ����.");
					else
						System.out.println("��ϵ��� �ʾҽ��ϴ�.");
			
			}else if (menu == 5) {
				System.out.println("ģ����� ���� �޴��Դϴ�.");
				String search = readStr("������ ģ������� �Է��ϼ���.");
				for (int i = 0; i < fri.length; i++) {
					if (fri[i] != null && fri[i].getName().indexOf(search) != -1) {
						fri[i] = null;
					}
				}
				System.out.println("�����Ϸ�.");
			} else if (menu == 9) {
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
		} // end of while
		System.out.println("��.");
				
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
					System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				}
			}
			return result;
		}
		
}
