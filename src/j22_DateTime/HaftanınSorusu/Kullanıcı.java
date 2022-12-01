package j22_DateTime.HaftanınSorusu;

import java.time.LocalDateTime;
// task 1.step

public class Kullanıcı {//kullanıcı obj uretecek kalıphane class main olmaz
     String name;// obj de deger olacak ıns.var
     LocalDateTime kayıtzamanı;//obj de deger olacak ıns var

    @Override
    public String toString() {// bu clastan olusturlan obj prınt etmekıcın obj datalarını strıng e cevırme
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtzamanı=" + kayıtzamanı +
                '}';
    }

    public Kullanıcı(String name, LocalDateTime kayıtzamanı) {// full parametrelı teleskopık cons.
        this.name = name;
        this.kayıtzamanı = kayıtzamanı;



    }
}
