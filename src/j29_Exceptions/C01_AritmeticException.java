package j29_Exceptions;

import java.util.Scanner;

public class C01_AritmeticException {
    public static void main(String[] args) {

        //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.print("agam 1. sayı giresen : ");
        int sayi1 = sc.nextInt();

        System.out.print("agam 2. sayı giresen : ");
        int sayi2 = sc.nextInt();

        int oran;//RTE -> ArithmeticException/ by zero

        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmazçcatch block try block exception hata yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
             3- parent-child ilişkisi olan catchlerde chıld once yazılmalı aksı halde CTE

             */

            oran = sayi1 / sayi2;// try block ta hata yakalandıgı satırdan sonra try dıger satırlar degıl ılgılı catch block calısır


            System.out.println(oran);
            System.out.println("agam try block'tan selamlar :) ");


        } catch (ArithmeticException falanfilan){//child exceptıon parent exceptıon(ebıkkabık)
            System.out.println("agam bolmeden bolen 0 olamaz" +falanfilan.getMessage());//exceptıon olustugunda sadece hata mesajı prınt etmek ıcın getMessage()kullanılır.
            falanfilan.printStackTrace();//olusan exceptıon tum detay bılgısı prınt etmek ıcın kullanılır
            System.out.println("agam cırak catch den selamlar");
    }
        catch (ArrayIndexOutOfBoundsException arrayExc){
            System.out.println("agam arrayda olmayan eleman ıstıyorsun");
        }
   catch (Exception ebikGabık) {//Exception Class tum exceptionlarınHz Ademi parent class->bad practice
       // hata yakalndıgında yapılacak aksiyonların oldugu block

       //Excepcıon -olusan hata data type
       //ebıkkabık - javanın olusan exceptıon'a atayacagı obj name best practıce:e
       System.out.println("agam nişledingg 0 hiç böler mi :( ");
       System.out.println("agam catck block'tan selamlar :) ");

   }finally { //catch bloklardan sonra ıstenırse fıanlly block kullanılabılır
            /*
            try -catch icinde yapılan ıslemlerden sonra mutlaka calısması gerekn block varsa fınally tanımlanır
            hata durumunda catch calısmazsa program sonlanır.ama fınally tanımlanırsa catch calısmasa bıle program akısı devam eder
            finally block hata olsada olmasada calısır.
            Cloud database ortamlarında baglantı kesmek ıcın kullanılır.cloud ıle connectıon yazdıgınızda code
             basarılı bır skılde calısırsa işlem bıtıtgınde fınally block ıle connectıon kağanmazsa malıyet pahalı olur

       */
            System.out.println("agam fınally blocktan selamlar");


        }
      //  catch (ArithmeticException falanfilan) {// child exceptıon parent exceptıon(Exception ebikGabık)den sonra tanımlandıgı ıcın CTE


        System.out.println("Agam selametle DEWAMKEEE :) ");//program sonuna kadar calıstı mesaj
    }











    }

