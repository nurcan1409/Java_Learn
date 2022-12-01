package L02_WhıleLoop;

import java.util.Scanner;

public class C02_WhıleLoop {
    public static void main(String[] args) {
        //gırılen tamsayının rakamları toplamını prınt eden method create edınız

        Scanner scan =new Scanner(System.in);
        System.out.println("bır sayı gırınız");
int sayı=scan.nextInt();

        System.out.println(rakamTopla(sayı));


    }

    private static int rakamTopla(int sayı) {
        int rakamTopla=0;
    while (sayı>0) {
        rakamTopla+=sayı%10;
        sayı/=10;
    }


        return rakamTopla;
    }


}
