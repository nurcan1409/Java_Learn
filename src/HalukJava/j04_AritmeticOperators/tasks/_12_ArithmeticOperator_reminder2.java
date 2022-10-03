package HalukJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

Scanner scan = new Scanner(System.in);
        System.out.println("ıkı sayı gırınız");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        int kalan= num1%num2;
        System.out.println("ıkı sayının bolumunden kalan:" + kalan);


    }
}
