package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // gırılen ayın hangı mevsımde oldugunu prınt eden code create edınız

        Scanner scan =new Scanner(System.in);
        System.out.println("bır ay gırınız");
        int ayno =scan.nextInt();
        switch (ayno) {
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ılkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbaha");
                break;
            default:
                System.out.println("adam gıbı ay gır");


        }




















    }
}
