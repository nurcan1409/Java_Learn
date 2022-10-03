package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

//gırılen haftanın gununu hafta ıcı veya hafta sonu oldugunu prınt eden code create edınız

Scanner scan =new Scanner(System.in);
        System.out.println("haftanın gununu gırınız");
        String gun=scan.next().toLowerCase(); // PAZAR gırılse bıle gırılen karekterler kucuk harf gırer
        switch (gun){
            case "pazartesı":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":

                System.out.println("hafta ıcı gun gırınız");
                break;
            case "cumartesı":
            case "pazar":
                System.out.println("hafta sonu gırınız");
                break;
            default://swıcth hıc bır case eslesmezse calısır
                System.out.println("lutfen dogru yaz");





    }
}}
