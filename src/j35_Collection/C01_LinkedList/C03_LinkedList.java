package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("javaCAN","Ebubekir", "Gülsüm","Ebubekir", "Adem", "İlker","javaCAN", "Merve"));
        
     // LinkedList remove...  ılk node sılınır ve sılınen node return edılır
        System.out.println("ll1.remove() = " + ll1.remove());//javacan
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.remove(3) = " + ll1.remove(3));//adem sılınen node return edıldı
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.remove(\"merve\") = " + ll1.remove("merve"));//true
        System.out.println("ll1 = " + ll1.remove("javatar"));//false -> olmayan eleman false verır
        
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.removeFirstOccurrence(\"ebubekır\") = " + ll1.removeFirstOccurrence("ebubekır"));//true
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1 = " + ll1.element());// ılk node return eder
        System.out.println("ll1 = " + ll1);


        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LinkedList get() getFirst() getLast()....girilen index ve ilk son node return eder..
        System.out.println("ll2.get(2) = " + ll2.get(2));//Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//javaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//Hasmayan

        
        
    }
}
