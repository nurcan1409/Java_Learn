package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner scanner =new Scanner(System.in);
		System.out.println("icinde bulundugunuz ayı yazınız");
		int ay= scanner.nextInt();
		switch (ay) {

			case 1:
				System.out.println("ocak");
			case 3:
				System.out.println("mart");
			case 5:
				System.out.println("mayıs");
				case 7:
				System.out.println("temmuz");
				case 8:
				System.out.println("agustos");
				case 10:
				System.out.println("ekım");
				case 12:
				System.out.println("aralık");
					System.out.println("gırdıgınız ay 31 gundur");
					break;
			case 4:
				System.out.println("nısan");
			case 6:
				System.out.println("hazıran");
			case 9:
				System.out.println("eylül");
			case 11:
				System.out.println("kasım");
				System.out.println("gırdıgınız ay 30 cekıyor");
				break;
			case 2:
				System.out.println("yılınızı gırınız");
				int yıl= scanner.nextInt();
				if (yıl%4==0) {
					System.out.println("gırdıgınız ay 29");
				} else
					System.out.println("gırdıgınız ay 28");
			default:
				System.out.println("lutfen dogru gırıs yap");






				{

				}

		}




























		}






























	}


