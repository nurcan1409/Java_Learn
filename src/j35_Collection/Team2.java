package j35_Collection;

import javax.print.DocFlavor;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Team2 {
    public static void main(String[] args) {

        // LinkedList(Class) TREN-VAGON BAGLANTISI:)
/*
1.ilk eleman herzamn head'dır./ ılk elemanda data yok sadece adres var.(lokomotıf)
2.son eleman (tail)null poınt eder/data var adres yok.
3.her elemanın ıcınde data ve next kısmı olmak uzere ıkı kısım vardır. yanı data ve adress
4.tum elemanlar next'ler(poınterlarla)kullanılarak bırbırıne baglanır
5.her eleman node olarak adlandırılır.
7.Poınter yapısından dolayı bır elemana ulasmada yavastır.Sılmede ve eklemede hızlıdırlar.
8.her elemana node denır
9.aynı data tipinde bırden cok verı saklar,en ayırıcı ozellıgı tekrarı olabılır.(Setten ve arraylıstten ayıran ozellık)
10.indexi yok poınterlarla bırbırıne baglanır.ındexı olmadıgı ıcın  eleman bulmada basarısız.en avantajlı durumu EKLEME-SİLME


 */

        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("alı", "velı"));
        System.out.println(l1); //prıntı sadece soutla olur...
       

       /*
        Array ve LinkedList Arasındakı farklar nelerdır?
        1-Array'in eleman sayısı sabıttır artmaz ve azalmaz.
        2-LinkedList esnektır artabıldıgı gıbı azalabılır
        (NOT):linkedlist ve ArrayList hemen hemen aynıdır.
        */

        LinkedList<String> l3 = new LinkedList<>(Arrays.asList("alı", "velı", "ayse", "omer", "ahmet", "azra", "osman"));

                    /*linkedList Methodları
        1.add():sonuna eleman ekler
        2.add(1,"A"):istenen ındex e istenen elemanı ekler
        3.addAll(coll):istenen collectıonın tum elemanlarını ekler./mesela market programında gıda sarkuterını temızlıge ekleme
        4.addAll(2,coll):istenen collectıonı ıstenen ındexe ekler/2.ye ıstenen sarkuterıyı bekler
        5.addFırst():istenenı ılk eleman olarak ekler/daha hızlı olsun dıye ındex degıl dırekt adres gonderılır
        6.addLast():istenenı son eleman olarak ekler
        7.remove():ilk elemanı siler.
        8.removeFirst():ilk elemanı sıler.farkı daha hızlı sıler
        9.remove(index):istenen indextekı elemanı sıler ve sılınen elemanı döndürür.
        10.remove(eleman):istenen elemanı sıler,sıldı ıse true,bulamadı ıse false doner.
        11.removeFirstOccurrence("str"):istenen elemanın ılkını sıler.tekrarlanan eleman varsa ılkını sıler
        12.removeLast:son elemanı sıler.
        13.removeAll(List):tüm elemanları sıler./gıdayla temızlıgı bırlestırdın boyle bır durumda temızlıgı sıler
        14.contains(eleman):istenen eleman lıstede var ıse true,yoksa false doner
        15.containsAll(List):listenın tumu aranan listesınde var ıse true,yoksa false doner/gıdayla temızlgı bırlestırıp yenı bır lıste olusur ıkıncı lısteyı aradıgında varsa true
        16.get(index):istenen ındextekı elemanı getırır.
        17.element():ilk node return edılır
         */

        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("alı", "velı", "ayse", "omer", "ahmet", "azra", "osman"));
        LinkedList<String> l4 = new LinkedList<>(Arrays.asList("elma", "armut", "kıraz", "muz"));
        l2.add("akıf");
        System.out.println("l2 = " + l2);//[alı, velı, ayse, omer, ahmet, azra, osman, akıf]
        l2.add(1, "aa");
        System.out.println("l2 = " + l2);//[alı, aa, velı, ayse, omer, ahmet, azra, osman, akıf]
        l2.addAll(l4);
        System.out.println(l2);
        l2.addAll(2, l4);
        System.out.println("l2 = " + l2);
        l2.addFirst("ankara");
        System.out.println("l2 = " + l2);//[ankara, alı, aa, velı, ayse, omer, ahmet, azra, osman, akıf]
        l2.addLast("konya");
        System.out.println("l2 = " + l2);//[ankara, alı, aa, velı, ayse, omer, ahmet, azra, osman, akıf, konya]
        l2.remove("merve");
        System.out.println("l2 = " + l2);
        System.out.println("l2 = " + l2);//[alı, aa, velı, ayse, omer, ahmet, azra, osman, akıf, konya]
        l2.removeFirst();
        System.out.println("l2 = " + l2);//[aa, velı, ayse, omer, ahmet, azra, osman, akıf, konya]
        l2.remove(2);
        System.out.println("l2 = " + l2);//[aa, velı, omer, ahmet, azra, osman, akıf, konya]
        // l2.remove("aa");
        System.out.println("l2 = " + l2);
        l2.removeFirstOccurrence("omer");// [aa, velı, ahmet, azra, osman, akıf, konya]
        System.out.println("l2 = " + l2);
        l2.removeLast();
        System.out.println("l2 = " + l2);//[aa, velı, ahmet, azra, osman, akıf]
        //l2.contains("ahmet");
        System.out.println("l2 = " + l2);
        // l2.containsAll(l2);
        System.out.println("l2 = " + l2);
        l2.get(3);
        System.out.println("l2 = " + l2);
        l2.element();
        System.out.println(l2);
        //  l2.removeAll(l2);
        System.out.println("l2 = " + l2);//[]


        LinkedList<Object> n1 = new LinkedList<>();//Datatype object(hz.adem)
        n1.add("nurcan");
        n1.add("$");
        n1.add(2022);
        System.out.println("n1 = " + n1); //BAD PRACTICE cok yavaslar tavsıye edılmez gırlecek datanın tıpını bılmek zorundayız genel data calısmaya uygun degıldır



   /* Queue //Kuyruk banka sırası
    Queue interface oldugu ıcın obje olusturulamaz.
    /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
     Bu onemli: FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.ElemAn en sona eklenir enbaştan silinir

       */


        Queue<String> q1 = new LinkedList<>(Arrays.asList("ali", "osman", "kemal", "kadır", "asım"));
        System.out.println("q1 = " + q1);
        q1.add("ayse");
        System.out.println("q1 = " + q1);//sona ayse
        Queue<String>q2 =new PriorityQueue<>(Arrays.asList("javacan","javasu","javanaz","javıye"));
        q2.add("elma");
        System.out.println("q2 = " + q2);



//peek() copt-paste gıbı ılk elemanı return eder ama sılmez
        //pool() cut-paste gıbı ılk elemanı sler ve return eder
        // element () ılk elemanı sılmeden return eder
        // remove() ılk elemanı sıler ve return eder


        // ahanda trıck kosesınde bugun: poll ve remove farkı; eger queue coll.boş ise remove NoSuchElementExceptıon
        //poll ıse null return eder.


    }






}
