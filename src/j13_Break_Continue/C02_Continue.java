package j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop’un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("bır mail hesabı gırınız");
String mail=scan.nextLine();

for (int i=0; i<=mail.length(); i++) {
    char c=mail.charAt(i);
    if (c==' ') {
        continue;
    }

    System.out.print(c);



}

















    }
}
