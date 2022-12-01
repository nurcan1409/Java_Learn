package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class _09_if_else_if_statement_with_logic_operators {

    public static void main(String[] args) {

      /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

      if(str.equals("orange") &&str.length()==6) {
          System.out.println("orange has sıx letters");
      } else if (str.equals("apple") &&str.length()==5) {
          System.out.println("apple has fıve letters");

      } else if (str.contains("orange") && str.length()>10) {
          System.out.println("Strıng contaın orange and length ıs more then 10");

      }


    }



}
