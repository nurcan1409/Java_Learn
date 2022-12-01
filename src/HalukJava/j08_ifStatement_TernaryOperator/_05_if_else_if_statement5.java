package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        double sayı1=90.25;
        double sayı2=90.25;
        if (sayı1>=sayı2) {
            System.out.println("hello woerd");
        } else if (sayı1<sayı2) {
            System.out.println("not hello world");

        }else System.out.println("ı love you");


    }
}
