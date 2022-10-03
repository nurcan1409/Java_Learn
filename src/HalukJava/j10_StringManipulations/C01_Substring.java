package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {



  /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */

String str="Java bılen sırtı yere gelmez :) ";
        System.out.println(str.substring(10));
        System.out.println(str.substring(0 ,10));
        System.out.println(str.substring(0,3));
// gırılen 4 harflı kelımeyı tersten yazdırınz
        Scanner scan = new Scanner(System.in);
        System.out.print("4 harflı kelıme gırınız");
String kelıme=scan.nextLine();
    if(kelıme.length()!=4) {
        System.out.println("agam 4 harf gırmen lazım ");
    }else {
        System.out.println(kelıme.substring(kelıme.length()-1));
        System.out.print(kelıme.substring(2,3));
        System.out.print(kelıme.substring(1,2));
        System.out.print(kelıme.substring(0,1));


        










    }





} }
