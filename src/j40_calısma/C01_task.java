package j40_calısma;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_task {
    public static void main(String[] args) {


        HashMap<String , Integer> hm=new HashMap<>();
        hm.put("alı", 67 );
        hm.put("velı" ,45);
        hm.put("osman" ,56);
        System.out.println("hm.put(\"ali\" ,60) = " + hm.put("ali", 60));
        System.out.println("hm.put(\"ayse\",67) = " + hm.put("ayse", 67));
        System.out.println("hm = " + hm);
        System.out.println("hm.get(\"velı\") = " + hm.get("velı"));

       hm.put("alı",21);
        System.out.println("hm.get(\"alı\") = " + hm.get("alı"));

        for (Map.Entry<String , Integer>entry: hm.entrySet()) {
            String isim= entry.getKey();
            Integer not= entry.getValue();

            System.out.println("not = " + not);


            }


        }



    }



   








