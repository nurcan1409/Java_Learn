package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

 /*
  task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
    Örnek Ekran çıktısı
*
* *
* * *
* * * *

   */

        Scanner scan =new Scanner(System.in);
        System.out.println("bır boyut gırınız");
        int boyut=scan.nextInt();

        for (int i=1; i<=boyut; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(" * ");
            }


            System.out.println();
        }















}














    }

