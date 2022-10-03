package j11_MethodCreation;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // gırılen 3 notun ortalamasını hesaplayan method create edınz
Scanner scan =new Scanner(System.in);
        System.out.print("1. notu gırınız");
        double not1=scan.nextDouble();
        System.out.print("2.notu gırınız");
        double not2=scan.nextDouble();
        System.out.print("3.notu gırınız");
        double not3=scan.nextDouble();


  }


    public static double ortalamaHesaplama(double a ,double b,double c ) {
        return (a+b+c)/3;
    }


}






