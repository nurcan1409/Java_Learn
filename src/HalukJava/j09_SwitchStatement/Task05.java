package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();
        not/=10;
        switch (not) {
            case 0:
            case 10:
            case 20:
            case 30:
            case 40:
                System.out.println("notunuz D dır");
                break;
            case 50:
                System.out.println("notunuz C dır");
                break;
            case 60:
            case 70:
                System.out.println("notunuz B dır");
                break;
            case 80:
            case 90:
            case 100:
                System.out.println("notunuz Adır");
                break;

            default:
                System.out.println("hıc bır puan alamadınz");










        }











    }


}
