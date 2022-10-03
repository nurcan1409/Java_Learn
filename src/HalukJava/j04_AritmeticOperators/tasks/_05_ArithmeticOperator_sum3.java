package HalukJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

Scanner scan =new Scanner(System.in);
        System.out.println("uc sayı yazınız");
      int num1= scan.nextInt();
      int num2=scan.nextInt();
      int num3=scan.nextInt();
        System.out.println("3 sayının toplam:" + ( num1+num2+ num3));




    }
}
