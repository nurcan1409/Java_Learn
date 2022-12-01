package j23_Varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
/*
arr ve varargs method:
 */
        int arr[] = {23, 42, 33, 10, 34, 45, 58, 38};//283
        System.out.println("arr topla= " + arrTopla(arr));//283

        System.out.println("varargsTopla= " + varargsTopla(23, 42, 33, 10, 34, 45, 58, 38));//283
        System.out.println("varargs array deger Topla(arr) = " + varargsTopla(arr));
//Trıck-> varargs method parametrelı arrar gıbı tanımladıgı ıcın
//varargs methoda parametre olarak arrayda verılebılır
//task1-> array elemanları toplamını prınt eden METHOD create edınız
//task2->task1 varargs ıle calısınız
    }// main sonu

    public static int arrTopla(int[] a) {//task1

        int toplam = 0;
        for (int w : a) {
            toplam += w;
        }


        return toplam;
    }

   public  static  int varargsTopla(int...b) {//task2
        int toplam=0;
        for (int s:b) {
            toplam+=s;

        }


       return toplam;
   }

}