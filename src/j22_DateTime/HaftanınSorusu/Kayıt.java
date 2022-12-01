package j22_DateTime.HaftanınSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı>kullanıcıKisiler=new ArrayList<>();
    // task 2. step


  public ArrayList<Kullanıcı> kayıtAl() {//kullanıcı clastan obj uretmek ıcın cons a gerekn name ve kayıtzamanı
      Scanner scan=new Scanner(System.in);
      System.out.println("\"adınızı gırınız\" = " + "adınızı gırınız");
      String ad=scan.nextLine();// kullanıcıobj ıcın name alındı
      Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 name kullanıcıdan kayıtzamanı LocalDateTime.now() alacak parametre alarak
      kullanıcıKisiler.add(k1);// olusturulan k1 obj lıste eklendı
      return kullanıcıKisiler ;//kullanıcı kısıler lıstı method cıktısı return olarak tanımladı

  }
// task 3.step
public void sanslıkullanıci( ArrayList<Kullanıcı>kllObj) {//kullanıcı lıstındekı objlerın kayıtzamanını 10 sanıyedn az olup olmamasına gore sanslı kullanıcı return edecek
for (Kullanıcı k:kllObj){//kullanıcı clastan kayıtal() method ıle uretılıp lıste atılan obj donguye alındı
    if(k.kayıtzamanı.getSecond()<=10){//donguye gıren herbır kullanıcı obj kayıtzamanı datasındakı sanıye verısı
        System.out.println(k.name+"sanslı kısısın 5 kılo bal kazandın sısteme gırıs zamanı:"+k.kayıtzamanı);
    }else System.out.println(k.name+"sanslı kısı degılsın  kazanamadın  sısteme gırıs zamanı:"+k.kayıtzamanı);



}




}


public void listele(ArrayList<Kullanıcı>kllObj){
    System.out.println("kllObj = " + kllObj);// kullanıcı clastakı tostrıng prınt eder

}


    public void sansliKullanici(ArrayList<Kullanıcı> kisi) {
    }
}
