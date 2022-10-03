package HalukJava.j10_StringManipulations;

public class C10_ValueOF_parse {
    public static void main(String[] args) {


        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
String bagış1= "1500";
String bagış2="2500";

   int bagışDegerı1= Integer.valueOf(bagış1);
   int bagışDegerı2=Integer.valueOf(bagış2);
        System.out.println("toplam bagıs mıktarı" + (bagışDegerı1+bagışDegerı2));

        System.out.println(Integer.parseInt(bagış1) + Integer.parseInt(bagış2));
   int tc= 123456;
  String yenıtc= String.valueOf(tc);
        System.out.println(yenıtc);

String fıyat= "$150";
int yenıfıyat=Integer.valueOf(fıyat);
        System.out.println(fıyat);






    }
}
