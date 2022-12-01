package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        /*
girilen bir ifadenin istenen harf sayısını print eden code create ediniz

input : selam javaCAN'lar
output : a sayısı :3
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bır cumle gırınız");
        String cumle = scan.nextLine();
        System.out.println("sayılacak harfi gırınız");

        char harf = scan.next().charAt(0);

        int harfSayısı = 0; // ilk deger 0 atandıkı saymada etkı etmesın

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == harf) {
                harfSayısı++;
            }
        }

        System.out.println("gırdıgınız cumle" +cumle + "istedgınız harf" +harf+harfSayısı+"kadar var");
    }
}