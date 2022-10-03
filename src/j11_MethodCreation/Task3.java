package j11_MethodCreation;

import java.util.Scanner;

import static j11_MethodCreation.C01_MethodCreation.topla;

public class Task3 {
    public static void main(String[] args) {

        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        Scanner scan =new Scanner(System.in);
        System.out.println("1. sayıyı gırınız");
        double sayı1=scan.nextDouble();
        System.out.println("2.sayıyı gırınız");
        double sayı2=scan.nextDouble();

        System.out.println("işlemınızı gırınız");
 char işlem =scan.next().charAt(0);

 topla(12,23);
 carpma(12,12);
 cıkarma(12,21);
 bolme(12,21);






    }// main sonu



public static void topla (int a,int b){
    System.out.println("a+b=" +(a+b));
}

public static void cıkarma(int a,int b) {
    System.out.println("a-b= +(a-b");
}

public static void carpma (int a,int b) {
    System.out.println("a*b= +(a*b");
}
public static void bolme(int a ,int b) {
    System.out.println("a/b=" +(a/b));
}
}
