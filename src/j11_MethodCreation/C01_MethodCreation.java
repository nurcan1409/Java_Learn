package j11_MethodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {
topla2();

            //main method açılış
        /*
        code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
        main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
        1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
        parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

        str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                              bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                              bana rapor olarak ne getirdigini bilmem lazim (true/false)

        2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

        3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
           de oldugu gibi
           disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
           deklare edilmeli

           method call edildiğinde  Parametre olarak
           declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
    */

        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
        //Method parantezinin icinde olusturulan variable'lara "parametre" denir.
        //Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
        //Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli


        // bir method Class'in icinde ama  main method'un disinda  cereate edilir
        // Best practice-> method'lar main method'dan sonra create edilir.

        System.out.println("javaya selam");

topla();// method call edıldı

        System.out.println("agam bu yazıyı okuduysan yukarıdakı meethod call oldu");//3.calısır
topla2(34 , 43);// parametrelı method call
    }





    private static void topla2() {
    }

    public static void topla() { //parametresız return type olmayan  voıd bır method
        int a=33;
        int b=23;
        System.out.println(a+b);//1.
        System.out.println("topla selamlar");//2.
    }
public static void topla2(int a, int b) {
    System.out.println(a+b);
}








}
