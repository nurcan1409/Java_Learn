package j15_Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {

        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */
// Md Array tanımlama
        int Arr1[][]=new int[3][5];// 3 katlı 5 daırelı olan bos bır apt- 3 satır 5 sutun tablo

//bır sıtede her bırınde 10 daırelık 8 katlı 6 apt var. nasıl arr olarak tanmlanı

//int sıte [][][]=new int[][][]
//24 kısılık 3 sınıf ve 21 kısılık 5
//int sınıf24[][]=new int[][];

        // mdArray eleman ekleme



//Mdarray elemanları prınt etme







    }
}
