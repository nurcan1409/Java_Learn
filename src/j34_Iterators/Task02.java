package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {



/*  task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
    */

        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 13, 56, 23, 45, 14, 40));
        ListIterator<Integer> it1 = l1.listIterator();

     while (it1.hasNext()) {
         int sayı1=it1.next();
         if(sayı1<20 || sayı1>40) {
            it1.remove();
         }
         System.out.println( l1);

     }










    }

}
