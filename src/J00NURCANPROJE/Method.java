package J00NURCANPROJE;

import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;
import java.util.Scanner;

import static P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01.Islemler.islemMenusu;

public class Method extends Kisi {



        static Scanner scan=new Scanner(System.in);
static String tercıh;

    public Method(String adSoyad, String kimlikNo, int yas) {
        super(adSoyad, kimlikNo, yas);

    }
    String []brans= {"kımya","matematık","yabancı dıl","Edebıyat","Fızık"};
    String []siniflar={"1A","1B","2A","2B","3A","3B"};

ArrayList<Kisi>Öğretmen=new ArrayList<>();
static ArrayList<Kisi>Öğrencı=new ArrayList<>();

public static void panelMenu(){

    System.out.println("**********************************    "+" \nOGRENCI VE OGRETMEN YONETIM PANELI\n"+"**********************************");
    System.out.println("1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
    System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");

    String secim=
          scan.next().toUpperCase();

    switch (secim){
        case "1":
            tercıh="Öğrencı";

            islemMenusu();
            break;
        case "2":
            tercıh="Öğretmen";

            islemMenusu();
            break;
        case "Q":
           cikis();
           break;
        default:
            System.out.println("yanlıs tuslama yaptınız");

            panelMenu();
            break;
    }





}

    private static void cikis() {

        System.out.println("sıstemden cıkıs yaptınız");

    }
   private static void islemMenusu() {










    System.out.println(" ıslem tercıhınızı gırınız");
    String islem=scan.next();

    switch (islem) {
        case "1":ekle();
        islemMenusu();
        break;
        case "2":arama();
        islemMenusu();
        break;
        case "3":listele();
        islemMenusu();
        break;
        case "4":sil();
        islemMenusu();
        break;
        case "q":
            System.out.println("sıstemden cıkıs yaptınız");
            break;
        default:
            System.out.println("yanlıs tuslama yaptınız");
            islemMenusu();
            break;



    }


}

private static void sil(){
    System.out.println("*** " +tercıh+ "***");
    boolean flag=true;
    System.out.println();
    System.out.println( "sılınecek ogrencının kımlık no gırılecek");
    String silinecekKimlikNo=scan.next();
    for (Kisi k:Öğrencı) {
        if (k.getKimlikNo().equals(silinecekKimlikNo)) {
            System.out.println("sılınecek ogrencı" + k.getAdSoyad());
             Öğrencı.remove(k);
             flag =false;
             break;
        }
    }
          {

    }
}
private static void listele() {

}
private static void arama() {

}
private static void ekle() {

}

}











