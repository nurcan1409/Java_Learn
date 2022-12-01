package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
     /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("1.sayıyı gırınız");
        int sayı1=scan.nextInt();
        System.out.println("2. sayıyı gırınız");
        int sayı2=scan.nextInt();
if(sayı1<sayı2) {
    for (int i = sayı1; i <= sayı2; i++) {
        if (i % 2 == 0) { //dongu ıcındekı sayıların cıftlıgıne baktık
            System.out.print(i + " ");

        }


    }
}}}
