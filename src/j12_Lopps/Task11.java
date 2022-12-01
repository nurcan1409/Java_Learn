package j12_Lopps;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */


        Scanner scan = new Scanner(System.in);
        int num;
        int toplam=0;

        do{

            System.out.print("Bir Sayı Girin: ");
            num = scan.nextInt();
            toplam+=num;

        }while(num != 0);

        System.out.println("Sayının Basamak Sayısı: " + toplam);





    }
}
