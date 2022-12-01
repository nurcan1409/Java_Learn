package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_Faktorıyel {
    public static void main(String[] args) {

            /*
       Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
       sayi!= 1*2*3* ...*sayi
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("bır sayı gırınız");
int sayı=scan.nextInt();

faktorıyel(sayı); // int parametrelı method call




    }

    public static void faktorıyel(int sayı) {
        int faktorıyel=1;

       for(int i=1; i<=sayı ; i++) {
           faktorıyel *=i;

       }

        System.out.println("faktorıyel:" + faktorıyel);

    }


}
