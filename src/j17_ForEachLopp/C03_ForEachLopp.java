package j17_ForEachLopp;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLopp {
    public static void main(String[] args) {
        
        //iki strıng array elemanlarının ortak olmasını kontrol eden code create edınız 
        
        String arr1[]={"nazım","gülsüm","erol","nurcan","izzet" };
        String arr2[]={"musty","gülsüm","eda","nurcan","cıgdem" };
        List<String>ortakısım=new ArrayList<>();
        
        for (String str1:arr1){
            for (String str2:arr2) {
                if (str2.equalsIgnoreCase(str1)) {
                    ortakısım.add(str2);
                    
                }
            }
        }
        
        if(ortakısım.isEmpty()) {
            System.out.println("ortakısım yok = " + ortakısım);
        } else System.out.println("ortakısım = " + ortakısım);
        
        
        
        
        
        
        
        
        
    }
}
