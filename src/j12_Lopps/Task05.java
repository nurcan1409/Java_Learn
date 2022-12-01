package j12_Lopps;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		
		Scanner scan=new Scanner(System.in)	;
		System.out.println("ısmınızı gırınız");
		String isim=scan.nextLine();
		System.out.println("soyısmınızı gırınız");

		String soyIsım=scan.nextLine();
		int a=0;
		int b=0;
		while (a<=isim.length()-1) {
			System.out.println(isim.charAt(a) +" ");
			a++;
		}
while (b<=soyIsım.length()-1) {
	System.out.println(soyIsım.charAt(b) +" ");
	b++;
}

		}












	}


