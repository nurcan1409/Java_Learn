package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        switch (kacıncıGun) {

            case 1:
                System.out.println("100 gun sonra pazartesı");
                break;
            case 2:
                System.out.println("100 gun sonra salı");
                break;
            case 3:
                System.out.println("100 gun sonra carsamba");
                break;
            case 4:
                System.out.println("100 gun sonra persembe");
                break;
            case 5:
                System.out.println("100 gun sonra cuma");
                break;
            case 6:
                System.out.println("100 gun sonra cumartesı");
                break;
            case 7:
                System.out.println("100 gun sonra pazar");
                break;
            default:
                System.out.println("hatalı gun yaptınız");










        }





    }
}

