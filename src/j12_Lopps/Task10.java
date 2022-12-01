package j12_Lopps;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int sayı = scan.nextInt();

        int toplam = 0;

        for(int i = 1; i <=sayı; i++){
            if(i%2!=0){
                toplam += i;
                //System.out.println(i);
            }
        }
        System.out.println("Tek Sayıların Toplamı = "+ toplam);
    }
}



