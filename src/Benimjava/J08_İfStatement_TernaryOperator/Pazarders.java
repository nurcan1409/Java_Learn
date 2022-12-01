package Benimjava.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class Pazarders {
    public static void main(String[] args) {


        // Task kullanıcıdan alınan not ortalamalarını gırınız
        //90+AA
        //80-90 BB
        //70-80 CC
        //70- F ***

        Scanner scan = new Scanner(System.in); // Kullanıcıdan sayı alma
        System.out.println("Lutfen notunuzu gırınız");
        int not = scan.nextInt();

        if (not >= 90 && not <= 100) {
            System.out.println("notunuz AA");
        } else if (not >= 80&&not < 90) {  // iki tarafında dogru oldugu durumlarda
            System.out.println("notunuz BB");

        } else if (not >= 70&&not < 80) {
            System.out.println("notunuz CC");


        } else if (not >= 0 && not < 70) {
            System.out.println("notunuz F Kaldınız ");

        }else System.out.println(" yanlıs not gırdınz");
    }


}
