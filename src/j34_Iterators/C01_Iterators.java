package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String>l1 =new ArrayList<>(Arrays.asList("nur","ayse","kemal","ozan"));
        System.out.println("l1 lıst ılk halı "+l1);


// l1 elemanları forr lop ıle prınt edınız...
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)+" ");

        }

// l1 elemenları for each loop ıle prınt edınız...
        for (String w : l1) {
            System.out.println(w +" ");
        }
        System.out.println();
        System.out.println("****");

        //l1 herbır elemanı :) for loop ıle update edıp prınt edınız...
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i,l1.get(i)+ " :)");

        }
        System.out.println("l1 update sonrası " + l1);

        // l1 herbır elemanı :) for each loop ıle uptade edıp prınt edınız...

        for (String w:l1) {
            w+=" :(";

              {
                  System.out.println("uptade sonrası" +l1);
                  /*
                  ındex desteklemeyen yapılarda tekrarlayan aksıyon ıcın for each lopp uptade yapamayabılırler yukarıdakı task de oldugu gıbı
                  bu durumda java ıterator ıntarface den tanımlanacak varıable ıle tekrarlayan aksıyonlar ındex olmadan yapılır.
                   */
                  System.out.println();
                  System.out.println("*** ıterators****");

                  Iterator<String> it1=l1.iterator(); // ıterator ontface den ıt1 varıable tanımlandı.atama olarak l1 elemanları atandı.
                  while (it1.hasNext()) {// it1 elemanları ıcın poınter old yerde eleman varsa true yoksa false verır ve poınter bır sonrakı eleman onune koyulur
                      it1.next();//next-> Lıst ın poınter onundekı elemanını return eder
                      System.out.println(it1.next()+" ");


        }
             List<String>l2=new ArrayList<>(Arrays.asList("baran","akıf","alı","ayse"))  ;
            //l2 elemanlarını ıterator ıle sılıp prınt edınız
                  System.out.println("ıterator oncesı l2 " + l2);
                  Iterator<String> it2=l2.iterator();
                  while (it2.hasNext()) {// tekrardakı poınter onunde eleman varlıgını kontrol eder
                      it2.next();//tekrardakı poınter onundekı elemanı sıler
                      it2.remove();// next() ıle gelen elemanı sılıer
                  }
                  System.out.println("ıterator remove sonrası l2" + it2);
                List<String>l3 =new ArrayList<>(Arrays.asList("baran","akıf","alı","ayse"));
                // l3 elemanlarını ıterator ıle set edıp prınt edınız
                  System.out.println("l3 ıterator oncesı" + l3);
                  ListIterator<String>it3= l3.listIterator();//tekrar ıterator yapısı tanımlandı

                  while (it3.hasNext()) {
                      it3.set(it3.next() +" :)");// tekrardakı next()ıle elemanı concat ederek uptade edıldı
                  }

                  System.out.println("l3 ıterator sonrası= " + l3);

                  List<String>l4 =new ArrayList<>(Arrays.asList("serhat","yakup","mustı","nazlı "));
                  System.out.println("l3 ıterator oncesı" + l3);
                  // l3 elemanlarının ılk harfı buyuk kln 3 harfı *** karakterı ve l4 lıstı ekleyıp prınt edınız

                  ListIterator<String>ebikGabık= l3.listIterator();//tekrar ıterator yapısı tanımlandı

                  while (ebikGabık.hasNext()){
                      ebikGabık.set(ebikGabık.next().toUpperCase().charAt(0)+"***");// next() ıle gelen l4 elemanı ılk harf byk kalan 3 harf *** lw set edıldı
                      ebikGabık.add(l4.toString());//tekrardakı uptade edılen l3 e 14 add edıldı
                  }






                  System.out.println("lısıterator set ve add sonrası l3 " + l3);
              }
            {


            }}}}





