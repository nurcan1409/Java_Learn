package j17_ForEachLopp;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


  /*
        for-each loop for loop'un gelilmş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.

         */



        List<Integer> sayıList = new ArrayList<>(List.of(16, 24, 56, 67, 89, 78));

        // task tum elemenlarını ayrı satırlara prınt edınız
        for (int i = 0; i < sayıList.size(); i++) {
            System.out.println("i = " + i);
        }

        for (Integer a : sayıList) {
            System.out.println("a = " + a);

        }

        //task lıste elemanların ılk 3 eleman harıc tek olanları prınt edınız
        for (Integer a : sayıList.subList(3, sayıList.size())) {

            if (a % 2 == 1) {
                System.out.println("a = " + a);
            }
            
        }

        //task elemanlarının 2 ıle 5 index elemanların(2,3,4,5) toplamını prınt edınız
        int toplam=0;
        for (int a:sayıList.subList(2,6)) {
            toplam+=a;
            System.out.println("a = " + a);
            
        }
        
        
        
    }



}