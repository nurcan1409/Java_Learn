package HalukJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("uc basamaklı sayı gırınız");
		int sayı = scan.nextInt();
		int ilkbasamak=sayı%10;
		int sonbasamak=sayı/100;
		System.out.println("sayının ılk basamagı" + ilkbasamak + "sayının sonbasamagı"+sonbasamak);



















		
	}

}
