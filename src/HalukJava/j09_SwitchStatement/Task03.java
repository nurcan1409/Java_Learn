package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        switch (gunNo) {

            case 1:
                System.out.println("gun pazartesı");
                break;
            case 2:
                System.out.println("gun salı");
                break;
            case 3:
                System.out.println("gun carsamba");
                break;
            case 4:
                System.out.println("gun persembe");
                break;
            case 5:
                System.out.println("gun cuma");
                break;
            case 6:
                System.out.println("gun cumartesı");
                break;
            case 7:
                System.out.println("gun pazar");
                break;
            default:
                System.out.println("hatalı gun gırdınız");













        }



    }
}
