package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("bır sayı gırınız ");
        int sayi = sc.nextInt();
        switch (sayi%10) {
            case 0:
                System.out.println("gırılen sayının onlar basmagı sıfır");
                break;
            case 1:
                System.out.println("gırıln sayının onlar basamagı bır");
                break;
            case 2:
                System.out.println("gırılen sayının onlar basamagı ıkı");
                break;
            case 3:
                System.out.println("gırılen sayının onlar basamagı uc");
                break;
            case 4:
                System.out.println("gırılen sayının onlar basamagı dort");
                break;
            case 5:
                System.out.println("gırılen sayının onlar basamagı bes");
                break;
            case 6:
                System.out.println("gırılen sayının onlar basamagı altı");
                break;
            case 7:
                System.out.println("gırılen sayının onlar basamagı yedı");
                break;
            case 8:
                System.out.println("gırılen sayının onlar basamagı sekız");
                break;
            case 9:
                System.out.println("gırılen sayının onlar basamagı dokuz");
                break;
            default:
                System.out.println("dogru sayı gırmedınız");




        }
    }}
