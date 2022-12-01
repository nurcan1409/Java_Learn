package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

           /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
       LİFO : Last in First out

         */



        Deque<String>dg1=new LinkedList<>(Arrays.asList("Küşleme","Önkol","ezme","haydarı"));
        dg1.add("humus");
        System.out.println("dg1 = " + dg1);//humus en sona eklendı
        System.out.println(dg1.getFirst());//ılk gordugunu küşleme getırır

        System.out.println(dg1.getLast());//son eleman humus

        System.out.println(dg1.peekFirst());//küşleme

        System.out.println(dg1.peekLast());//humus


        /*
        ahan da TRİCK :getFirst() meth deque coll. boş ise  NoSuchElementException firlatır
        peekFirst() math. deque boş ise null return eder.
         */

        dg1.clear();
        System.out.println("dg1 = " + dg1);//[]
        System.out.println("dg1.peekFirst() = " + dg1.peekFirst());
        //System.out.println("dg1.getFirst() = " + dg1.getFirst());//RTE NoSuchElementExceptıon
        System.out.println("agam devamkeee");

        Deque<String>dg2=new LinkedList<>(Arrays.asList("havuc dlımı","güllaç","muhallebı","haydarı"));
        //dg2.clear();
        System.out.println("dg2.pollFirst() = " + dg2.pollFirst());
        System.out.println("dg2.pollLast() = " + dg2.pollLast());
        System.out.println("dg2.removeFirst() = " + dg2.removeFirst());
        System.out.println("dg2.removeLast() = " + dg2.removeLast());
        System.out.println("devamkeeee");


    }
}
