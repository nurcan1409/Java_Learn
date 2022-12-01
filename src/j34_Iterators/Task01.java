package j34_Iterators;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {



/*
        task -> Verilen bir integer listin tek  elemanlarının karesini tersten iteartor  print eden code create ediniz

         */


        List<Integer> l1 = new ArrayList<>(Arrays.asList(3, 34, 67, 89, 99, 6, 8));
        ListIterator<Integer> it1 = l1.listIterator();

        while (it1.hasNext()) {

         it1.next();

            
                
            }
while (it1.hasPrevious()) {
    int tekkare=it1.previous();
    if(tekkare%2==1) {
        tekkare*=tekkare;
        System.out.println("kare = " + tekkare);
    }
}

        }





    

}
