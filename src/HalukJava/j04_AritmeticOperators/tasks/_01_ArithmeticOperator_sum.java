package HalukJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("iki tane sayı yazınız");
      int num1= scan.nextInt();
      int num2= scan.nextInt();
        System.out.println(num1+num2);

    }
}
