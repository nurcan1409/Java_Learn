package j11_MethodCreation;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		
Scanner scan =new Scanner(System.in);
		System.out.println("kare ,dıkdortgen, ucgen bırını secınız");
String secim=scan.next().toLowerCase();
		System.out.println("1. sayı secınız");
int sayı1=scan.nextInt();
		System.out.println("2.sayıyı gırınız");
int sayı2=scan.nextInt();

kareAlan(sayı1 ,sayı2);
dıkdortgenAlan(sayı1 ,sayı2);
	}

public static void secim(String str, int sayı1, int sayı2) {
		switch (str) {
			case "kare":
           kareAlan(sayı1 ,sayı2);
            kareCevre(sayı1 ,sayı2);
				break;

			case "dıkdortgen":
				dıkdortgenAlan(sayı1 ,sayı2);

				break;
			case "ucgen":

				break;

			default:
				}





		}

	private static void dıkdortgenAlan(int sayı1, int sayı2) {
		System.out.println("dıkdortgen alan:" +((sayı1*sayı2)*2));
	}

	private static void kareCevre(int sayı1, int sayı2) {
	}

	private static void kareAlan(int sayı1, int sayı2) {
		System.out.println("kare alan:"+ (sayı1*sayı2));
	}





}








