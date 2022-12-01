package j11_MethodCreation;

import java.util.Scanner;

public class Task15 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */

        System.out.println("aırlınese hosgeldınız. bcd  sehırlerınden bırını secınız");
String rota =scan.next().toLowerCase();
        System.out.println("ucus yonu ıcın yon secınız");
        int ucusyonu=scan.nextInt();
        System.out.println("yasınızı gırınız");
        int yas =scan.nextInt();
        double fıyatB=500*0.10;
        double fıyatC=700*0.10;
        double fıyatD=900*0.10;

        if(rota.equals("B") || rota.equals("C") || rota.equals("D")){
            if(yas>65) {
                if(rota.equals("B")) {
                    if(ucusyonu==1) {
                        System.out.println("65 yas ustu B ye ucus toplam bılet fıyatınız" +(fıyatB*0.8)+"$");
                    }
                }
            }
            } else if (yas<24 && yas>12) {
        }else if(yas<12) {

            }else System.out.println("malesef ucamazsın");















    }















}
