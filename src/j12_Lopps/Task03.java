package j12_Lopps;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
				
Scanner scan=new Scanner(System.in);
		System.out.println("bır sayı gırınız");
		int carpımTablosu=scan.nextInt();
		int carpım=1;
		while (carpım<=10){
			System.out.println(carpımTablosu + "*" +carpım );
			carpım++;
		}



















	}

}
