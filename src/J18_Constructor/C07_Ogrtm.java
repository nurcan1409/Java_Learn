package J18_Constructor;

public class C07_Ogrtm { // ogretmen ıcın kalıphane

//Fıelds
    String isim;//nurcan ogret.
    int tecrübe;//11
    int kıdem=5;


    public C07_Ogrtm(String isim, int tecrübe) { // 2 paramtrelı
        this.isim = isim; //nurcan ogr
        this.tecrübe = tecrübe;// 11
    }

   public void  kıdemHesapla(int kıdem){// int paramtrelı void

       System.out.println("agam kıdemın:"+(kıdem*2));// method paramtr. degerı kıdeme atanır
       System.out.println("agam kıdemın:"+(this.kıdem*2));// ins.obj degerı kıdeme atanır
   }


}
