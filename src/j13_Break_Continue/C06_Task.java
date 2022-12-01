package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {


        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("bır ıfade gırınız");
String ıfade=scan.nextLine();
int aSayı=0;
for (int i=0; i<=ıfade.length();i++) {

if(ıfade.charAt(i)=='a') {
    aSayı++;
} else if (ıfade.charAt(i)=='c') {
    break;

}
    System.out.println("cumlede ısleme gıren karakterler:" +ıfade.charAt(i));


}
        System.out.println("a sayısı:" +aSayı);








    }
}
