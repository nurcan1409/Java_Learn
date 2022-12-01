package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilds {
    public static void main(String[] args) {

        String str="javacan";
        System.out.println(" mthod oncesı str = " + str);
strBirlestı(str);// makyaja gıttı
        System.out.println(" mthod sonrası str = " + str);// javacan ımmutable

     //task 50000   tekrarlı bır loop ıle strıng ve strıngbuılder obj run tıme surelerını karsılastırın

     String str1="";
     StringBuilder sb1=new StringBuilder("");
        LocalTime str1basla=LocalTime.now();
        System.out.println("str1Time = " + str1basla);
        for (int i=0; i<50000; i++){
            str1+=i;
        }

        LocalTime sb1bitti=LocalTime.now();
        System.out.println("sb1bitti = " + sb1bitti);













    }// main sonu

    public static void strBirlestı(String str){
        System.out.println(str+"selam olsun ");
    }









}
