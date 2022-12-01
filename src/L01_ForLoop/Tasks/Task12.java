package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

/*
Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
toplamının hesap eden code create ediniz
 */

        Scanner scan=new Scanner(System.in);
        int toplam=0;// toplama etkı etmeyecek bır varıable olusturdu
int sayı=scan.nextInt();
for (int i=1; i<=5; i++) {
    System.out.println(i+ ". sayıyı gırınız");
    if(sayı<=10 ||sayı>=20) {
        toplam+=sayı;
    }
}

        System.out.println("gırdıgnız sayının toplamı" +toplam);











}


    }




