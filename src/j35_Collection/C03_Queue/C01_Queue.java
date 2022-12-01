package j35_Collection.C03_Queue;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class C01_Queue {
    public static void main(String[] args) {

        /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
     Bu onemli: FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

       */



        Queue<String>q1=new LinkedList<>(Arrays.asList("ali","osman","kemal","kadır","asım"));
        System.out.println("q1 = " + q1);
        q1.add("erol");
        System.out.println("q1 = " + q1);//sona erol
        Queue<String>q2 =new PriorityQueue<>(Arrays.asList("javacan","javasu","javanaz","javıye"));
        q2.add("elma");
        System.out.println("q2 = " + q2);

        System.out.println("q2 = " + q2);// basa javıdan


        System.out.println(q1.element());// en bastakı eleman aliyı verır
        System.out.println(q1.peek());// en bastakı aliyı verır
        System.out.println(q1.remove());// en bastakı aliyi verır//ılk bossa exceptıon atar ve ılk elemanı sıler
        System.out.println(q1.poll());

        //peek() copt-paste gıbı ılk elemanı return eder ama sılmez
        //pool() cut-paste gıbı ılk elemanı sler ve return eder
        // element () ılk elemanı sılmeden return eder
        // remove() ılk elemanı sıler ve return eder


        // ahanda trıck kosesınde bugun: poll ve remove farkı; eger queue coll.boş ise remove NoSuchElementExceptıon
        //poll ıse null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
       // System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true


/*
ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
 add meth Exception fırlatır.offer ise true-false return eder.

*/



    } }