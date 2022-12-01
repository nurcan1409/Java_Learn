package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Taskteam2 {
    public static void main(String[] args) {

        /* Node degerlerı "pazartesı","salı","carsamba","persembe",cuma" olan bır lınkedlıst create edınız.
        Gırılen bu strıng degerin varlıgını kontrol edıp varsa silip "bu gunler silindi" yoksa "aradıgınız gun haftasounudr"yazdıran code cread edınız

         */

        LinkedList<String>l1=new LinkedList<>(Arrays.asList("pazartesı","salı","carsamba","persembe","cuma" ));

        Scanner scan=new Scanner(System.in);
        System.out.println("aradığınız günü giriniz");
        String aranangun=scan.next();

        if (l1.remove(aranangun)) {
            System.out.println("günler silindi" );//istenen node true ve silindi
            System.out.println("l1 = " + l1);
        }else System.out.println(" aradıgınız gun haftasonudur,listede yoktur");











    }
}
