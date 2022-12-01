package L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //41 kere masallah create edınız

           /*
        loop->döngü tekrarlanan aksiyonlar için kullanılan code blok'larıdır
         */

        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i + ".masallah");// dongu boyunca tekrarlanacak aksıyon
        }

        System.out.println("merhabalar");

        // Task 2 basamaklı tek sayıları yan yana print eden code create ediniz -> 11 13 15.....

        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        } // calısmayan loop
        for (int i = 0; i > 10; i++) { // sartı saglamayan false olan body run olmaz,kod kırılarak sıradakı satırdan devam eder
            System.out.println(i + " ");
        }
        //durmayan loop
       for(int i=0 ; i>=0 ; i++) { // sonsuza kadar gıder
           System.out.println(i+" ");
       }
    }









}

