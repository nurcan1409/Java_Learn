package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {

        List<String>menu=new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
alfbtktkrrszprınt(menu);
System.out.println(" ****  ");
chrSysTersSıraPrınt(menu);
System.out.println(" ****  ");
chrktrsayısıby(menu);
System.out.println("****");
sonharfegoretersprnt(menu);




    }// main sonu

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

public static void alfbtktkrrszprınt(List<String>menu){
        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t+" "));
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
       // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
       // Sıralı akışlar için, farklı elemanın seçimi sabittir
      // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
      // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.




}
// Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void chrSysTersSıraPrınt(List<String>menu){
        menu.stream().map(String::length).//akıstakı strıng eleman karakter sayısına update edıldı
        sorted(Comparator.reverseOrder()).
                distinct().forEach(t->System.out.print(t+" "));

    }
// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

    public static void chrktrsayısıby(List<String>menu) {
        menu.stream().sorted(Comparator.
                comparing(String::length)).//akıstakı strıng elemanların lenghtıne gore dogal sıra
                forEach(t->System.out.print(t+" "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
public static void sonharfegoretersprnt(List<String>menu){
      menu.stream().
              sorted(Comparator.
                      comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
              forEach(t->System.out.print(t+" "));


}

// Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

}
