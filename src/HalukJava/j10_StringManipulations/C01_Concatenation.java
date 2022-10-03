package HalukJava.j10_StringManipulations;

import javax.print.DocFlavor;

public class C01_Concatenation {

    public static void main(String[] args) {

        String name = "nur";
        String meslek="tester";
        name.concat(meslek);
        System.out.println(name.concat(meslek));
        // strıng metotları varıablede gecıcı degısıklık yapar ama degısken atama yaparsa kalıcı olur

        name=meslek.concat(name);
        System.out.println("name" + name); // tester nur

        System.out.println(name.concat(true+":)"));
        System.out.println(name.concat(100+":)"));

String ad="ali";
String is="ascı";
        ad.concat(is);
     System.out.println(ad.concat(is));

        String ad1="kerem";
        String soyisim="kartal";
        String bosluk=" ";
       String adsoyad=(ad1+ bosluk+ soyisim);
        System.out.println(adsoyad);
        System.out.println(adsoyad.length());

//String bilgi=  ("Benım ismim  "+isim + "ve soy isim" +soyisim);

String soyisimbilgi=("soyisim=" +soyisim);
        System.out.println(soyisimbilgi);
     String bır= "sev";
     String iki= "dov";
     String bosluk1=" ";
     String toplu =(bır.concat(bosluk1).concat(iki));
        System.out.println(toplu);



    String kus="serce";
    String kopek="av";
        System.out.println(kus+" "+ kopek);
        System.out.println(kus.concat(kopek));

String sehır="ıstanbul";
        System.out.println(sehır.charAt(4));

String ısım="nurcan ";
        System.out.println(ısım.indexOf("j"));
        System.out.println(ısım.indexOf("cok"));
        System.out.println(ısım.indexOf('a' ,5));
        System.out.println(ısım.lastIndexOf("cok"));
        String dıller="arapca, ıngıılızce";
        System.out.println(dıller.contains("arapca"));

        System.out.println(dıller.endsWith("a"));

        System.out.println(soyisim.startsWith("a"));

















    }

















}
