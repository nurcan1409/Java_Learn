package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastİndexOf {
    public static void main(String[] args) {

   /* indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false

        */
        String str = "Good";
        System.out.println("ilk gorulen onun yerı" + str.indexOf("d"));//3
// olmayan karekter sorgulanırsa -1 return eder

        System.out.println(str.indexOf("od")); // od u nerde yakalarsa onu bulur/2

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim = "musrafa nızamoglu";
        System.out.println(isim.indexOf("a"));//4
        System.out.println(isim.lastIndexOf("a"));//11
        System.out.println(isim.indexOf("fa"));
        System.out.println(isim.lastIndexOf("fa"));

     /*   task
        Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz
        1-Girilen cumle java icermiyor
        2-Girilen cumle 1 tane java iceriyor
        3-Girilen cumlede birden fazla java var
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("bır cumle gırınız");
        String cumle = scan.nextLine().toLowerCase();
        if (cumle.indexOf("java") == -1) {
            System.out.println("gırılen cumle java ıcermıyor");
        } else if ( cumle.indexOf("java") ==cumle.lastIndexOf("java")){
            System.out.println("cumlede bır tane java var");
        }else System.out.println("gırılen cumlede cok java var");


    }
}
