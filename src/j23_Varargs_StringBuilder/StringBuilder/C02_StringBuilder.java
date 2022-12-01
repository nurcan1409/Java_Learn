package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
     //StringBuilder obj create etme...
     //1.yol
     StringBuilder sb1=new StringBuilder();

        System.out.println("sb1.length() = " + sb1.length());//0 sb1 dekı karakter sayısını return eder
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("javatar");
        System.out.println("sb1 = " + sb1);//javatar sb1 e eklendı
        sb1.append("selam").append("olsun").append(" ").append(24).append(true);
        System.out.println("sb1 = " + sb1);// javatar selam olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34
        sb1.append("basarı gayrete asıktır");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

       // 2.yol
       StringBuilder sb2=new StringBuilder("kevser hanıma selamlar") ;//ilk deger ataması yapılmıs sb1 stbuıl obj
        System.out.println(sb2.capacity());//38-> 22 karakter ılk deger atamasındanolustu
        // trım fazladan ayrılan capcıty sılınır
        System.out.println("sb2.length() = " + sb2.length());//22
        sb2.trimToSize();// karakter sayıısndan fazla kalan hafıza kısmını sılıyor
        System.out.println("sb2.capacity() = " + sb2.capacity());

// 3.yol
        StringBuilder sb3= new StringBuilder(11);// hafızada 11 karakterlık yer ayıran bos sb atandı
        System.out.println("sb3.length() = " + sb3.length());// bos sb3 karakter sayısı =0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekır bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        //istenen bır karakter indexi alma;
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));
// belırlı bır aralıktakı krakterlerı alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));// baslangıc dahıl 12 ye kadar
        System.out.println("sb1.substring(17) = " + sb1.substring(17));// 17 ve son karaktere kadar
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

      //belırlı bır ındextekı karakter sılme
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3.ındexı sıldı
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3 4 5 6 sılıncek
//ıstenen karakter veya karakterlerı ekleme
        System.out.println("sb3.insert(4,\":\") = " + sb3.insert(4, ":"));
String s="guzel ınsan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));

        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//sb3 valuesını 1.ındexıne s valuesının 3,7 ındex eklendı
        StringBuilder sb4=new StringBuilder("nıhan hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));
//istenen indexdekı karakterı degıstırme
sb4.setCharAt(6,'A');
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.insert(5, \" \" ) = " + sb4.insert(5, " "));

// istenen ındex e karakter yerıne bırden cok karakter ekleme
        System.out.println("sb4.replace(8,10,\"hı\") = " + sb4.replace(8, 10, "hı"));

//Sıtrıngbuılder obj Strınge cevırme- to strıng
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());// sb strınge cevrılerek touppercase meth.calıstı
//String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

   StringBuilder sb5=new StringBuilder("javacan");
   StringBuilder sb6=new StringBuilder("javacan");
   String str1="javacan";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
//sb6.compareto(str1)CTE -> olan armut kıyası olmazz
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//false-> SB equals ==gıbı calısır -> hem value hemde ref degere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));// true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true


    }
}
