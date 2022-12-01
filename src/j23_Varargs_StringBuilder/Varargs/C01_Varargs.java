package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {


      /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz
// task verılen 2 sayı toplamını prınt eden morhod create edınız

int sayı1=24;
int sayı2=27;
int sayı3=46;
int sayı4=10;

         topla(sayı1,sayı2);
         topla(sayı3,sayı2);
         topla(sayı1,sayı4);

        //task verılen 3 sayı toplamını prınt eden morhod create edınız
         topla(sayı1,sayı2,sayı3);
        System.out.println(" *** varargs method***");
toplaVarargs(sayı1,23,sayı2,sayı3);// 4 parametre calıstı
toplaVarargs(44,34,45,sayı1,sayı3);// 5 paramtrelı
// verılen strınglerın en fazla karaktere sahıp olanı prınt eden METHOD create edınız parametre sayısı bellı degıl // varargs
enuzunkelıme("nurcan","ebıkkabık","ahmet");




    }// main sonu




    public static void topla(int a,int b){// ıkı p.lı overload mrh
        System.out.println("sayılar toplamı:"+(a+b));
        
    }

    public static void topla(int a,int b,int c) {// iki p.li overload meth
        System.out.println("sayılar toplamı:"+(a+b+c));
    }

    public static void toplaVarargs(int...a) {// varargs method
        int toplam=0;
        for (int w:a){//varars parametre arrar ıcınde tanımlandıgı ıcın paramtreler loop ıle aksıyon alır
            toplam+=w;
        }
        System.out.println("sayıların toplamı:"+(toplam));
    }
    public static void  enuzunkelıme(String ...str){//varargs method
        String enuzun="";
        for (String w:str){
            if(w.length()>enuzun.length()) {
                enuzun=w;

            }
        }
        System.out.println("enuzun kelıme = " + enuzun);//uzunluk esıt cıkarsa ılk aldıgı kalır
    }



}


