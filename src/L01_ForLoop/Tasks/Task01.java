package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
       		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
       		- Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

        Scanner scan =new Scanner(System.in);
        System.out.println("bır tamsayı gırınız");
int sayı=scan.nextInt();

 if(sayı>100) { //gırılen sayı 100 den kucuk olma sartı
     System.out.println("hanı 100 den kucuk gırecektın");
 } else {
     for(int i=1 ; i<sayı ; i++) {
         if(i%3==0) {
             System.out.println("java");
         } else if (i%5==0) {
             System.out.println("can");


         } else if (i%3==0 && i%5==0 ) {
             System.out.println("javacan");

         }else System.out.println(i +"hadı hoscakal");

     }


     }






















    }
}
