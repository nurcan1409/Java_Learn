package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
// kulanıcının gırdıgı yılın ay sırasına gore ayın ısmın prınt eden code creade edınız

        Scanner scan= new Scanner(System.in);
        System.out.println("bır ay gırınız");

    int ayno= scan.nextInt();
    switch (ayno) {
        case 1:
            System.out.println("ocak");
        case 2:
            System.out.println("subat");
        case 3:
            System.out.println("mart");
        case 4:
            System.out.println("nısan");
        case 5:
            System.out.println("mayıs");
        case 6:
            System.out.println("hazıran");
        case 7:
            System.out.println("temmuz");
        case 8:
            System.out.println("agustos");
        case 9:
            System.out.println("eylul");
        case 10:
            System.out.println("ekım");


    }




























    }
}
