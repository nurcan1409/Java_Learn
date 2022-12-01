package J18_Constructor;

public class C06_Ögrencı {// ogrencı obj sı ıcın kalıphane
// Fıelds
    String isim="nurcan";
    int yas;
String name;//salıha
int age;//21

    public C06_Ögrencı(String isim, int yas) {
      //  this.isim = isim;//salıha
        //this.yas = yas;//21

        name=isim;
        age=yas;
        System.out.println("constakı isim:"+ isim);
        System.out.println("constakı isim:"+ this.isim);
        System.out.println("constakı name:" + name);
    }
}
