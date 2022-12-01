package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>(Arrays.asList(24,38,65,9,11,27,23));

        // l1 elemanlarını tersten prınt edınız...

        System.out.println("l1 lıst ılk halı= " + l1);
/*
tekrarda son elemanda baslayan ıslemler ıcın poınter en sona goturulmelı
bunun ıcın poınter'e sona goturen hasnext() meth.calısmalı
 */

        ListIterator<Integer>it1= l1.listIterator();
        while (it1.hasNext()) {// bastan sona poınter sureklı sona dogru ılerler
            it1.next();

        }
        while (it1.hasPrevious()) {// sondan basa poınter sureklı basa dogru lerler

            System.out.print(it1.previous()+" ");
           // System.out.println("l1 tersten prınt halı : "+ l1);

            List<String> l2=new ArrayList<>(Arrays.asList("cagla","ugur","nurcan","murat"));
            //l2 elemanlarının sonuncusuna :) ekleyıp prınt edınız
            System.out.println("lıstIterator oncesı l2 = " + l2);

            ListIterator<String>it2= l2.listIterator();// l2 elemanlarını tekrarlayan lıstıterator tanımlandı

            while (it2.hasNext()){
              String s=  it2.next();

               if(!it2.hasNext()){ // son eleman -> sonrasında eleman yok
                   it2.set(s+" :)");
            }

            System.out.println(l2);




   /*
      çoooğ önemli ->  hasPrevious() meth için MUTLAKA KESİNLİKLE hasNext() ve next() meth
      calıştırılarak cursor(pointer) en sona getirilmeli.

      ITERATOR VE LISTITERATOR farkları

      1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
         LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

      2- LISTITERATOR -> sadece List yapılarda tanımlanır
         ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

      3- ITERATOR-> sadece ileri b->s tekrarlar
        LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

        ITERATOR-> kapsamı geniş ama aksiyonu az
        LISTITERATOR -> kapsamı dar ama aksiyıonu çok

         */










        }


    }
} }
