package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
       // gırılen ay numarasına gore kac gun cektıgını prınt eden code create edınız
        Scanner scan = new Scanner(System.in);
        System.out.println("bır ay gırınız");
        int ayno = scan.nextInt();

        switch (ayno) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("gırılen ay 31 gun ıcerır");

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("gırılen ay 30 gun ıcerır");











        }













    }
}
