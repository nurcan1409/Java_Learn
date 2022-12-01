package j25_Encapsulatıon.encapsulatıon02;

public class Kısı { // pojo class
    /*
    kısı pojo class ıcın fıleds -> ad ,soyad,password(String), yas
    tum fıled'lerı kullanıcı goreblmelı ve uptade edebılmelı
     password encapsulated uptade edılmemelı
     yas varıable negatıf deger gırmye karsı encapsulated
     runner classda obj ıle fıeld ları prınt eden code create edınız
     */

    String ad;
    String soyad;
   private int yas;
  private String password;


    public Kısı(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;


    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }

    public String getPassword() {
        return password;
    }


    }








