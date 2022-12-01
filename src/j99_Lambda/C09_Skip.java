package j99_Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {
    public static void main(String[] args) {

        //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa  skip(n) neth dan sonra boş akıs return eder.skip(n) ara işlemdir.


        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
       // ilkIkiHrcSonHrfSıralıElPrint( menu);//[trileçe, bicibici, tantuni, büryan, welemen, cacix, kokerç, güveç, soğanlı, arabAşı]
        System.out.println("\n   ***   ");
    }// maın sonu



    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.

public static void ilkIkiHrcSonHrfSıralıElPrint( List<String> menu) {
     
    System.out.println(
            Arrays.asList(
                    menu.
                            stream().
                            sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akısdaki elelmanların son karakrerine göre sıralanadı
                            skip(2).//akısdaki ilk 2 eleman akısdan atıldı
                            toArray()//akıs elelmalanrı bir arraya atanadı
            )
    );

    menu.
            stream().
            sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akısdaki elelmanların son karakrerine göre sıralanadı
            skip(2).forEach(t-> System.out.print(t+" "));//akısdaki ilk 2 eleman akısdan atıldı




}




}
