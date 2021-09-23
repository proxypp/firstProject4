package Yedam;

import java.util.Scanner;

public class ScanUtil {
	static Scanner scn = new Scanner(System.in);
	public static int readInt(String msg) {
		System.out.println(msg);
		return scn.nextInt();
		
	}
	public static String readStr(String msg) {
		if (scn.hasNextLine()) {
			scn.nextLine();
		}
		System.out.println(msg);
		return scn.nextLine();
	}
	
}
