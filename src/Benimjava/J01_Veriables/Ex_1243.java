package Benimjava.J01_Veriables;

public class Ex_1243 {
    public static void main(String[] args) {

     String str= "nurcan yerlıkaya";
     int sayi;
 sayi=str.indexOf(" ");
        System.out.println("sayi = " + sayi);

String s1,s2;
s1=str.substring(0,sayi);
s2=str.substring(sayi+1);
str= s2 +" "+ s1;
       str= str.toUpperCase();
        System.out.println("str = " + str);
    }
}