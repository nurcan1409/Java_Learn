package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {

     /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        polindrome:her iki yönde okundugunda eşit olan ifadeler
        ey edip adanada pide ye
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("bır metin gırınız");
String str=scan.nextLine();
polindrome (str);  //Strıng parametrelı bır method call



    }

    public static void polindrome(String str) {
     String tersStr="";//bos bır strıng kutu
for(int i=str.length()-1; i>=0 ; i--) {
    tersStr+=str.charAt(i);//str nın i.cı karakterını tersstrye ekler.concat
}

        System.out.println("gırılen ıfadenın tersı" + tersStr);
if(str.equalsIgnoreCase(tersStr)) {  // str ıle tersStr arasında esıtlık kontrolu
    System.out.println("gırılen ıfade POLINDROME");
}else System.out.println("gırlen ıfade polındrome degıl");
    }

}