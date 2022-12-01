package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("agam pın gırınız");
        String dogrupın="javacan";

        int girişhakkı=3;
        while (true) {
            System.out.println("pın gırınız");
            String agapın=scan.nextLine();
            if(agapın.equals(dogrupın)) {
                System.out.println("agam sanslısn");
                break;
            }else System.out.println("malesef olmadı");
            girişhakkı--;
            if(girişhakkı==0) {
                System.out.println("hakkınız bıtti");
                break;
            }

        }














    }
}
