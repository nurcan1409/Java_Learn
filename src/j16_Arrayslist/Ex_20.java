package j16_Arrayslist;

import org.w3c.dom.html.HTMLIsIndexElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_20 {
    public static void main(String[] args) {

        ArrayList<Integer> Listsayi=new ArrayList<>();
        System.out.printf("listsayi" + Listsayi);

        Listsayi.add(10);
        Listsayi.add(2);
Listsayi.add(2);
        System.out.printf("Listsayı"+Listsayi);


ArrayList<String>Listisim=new ArrayList<>(Arrays.asList("nur","alı","fatma","kemal"));

        System.out.println("Listisim = " + Listisim);
ArrayList<String>Listulke=new ArrayList<>(List.of("almanya","amerıka","cın"));

        System.out.println("Listulke = " + Listulke);


Listsayi.add(2,4);
        System.out.println("Listsayi = " + Listsayi);





    }
}
