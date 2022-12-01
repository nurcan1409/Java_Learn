package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {

   /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bşr methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

         */
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.

 double fiyat=100;// prımıtıve double type varıable
        System.out.println("method call oncesı fıyat = " + fiyat);//100
fiyatArttır(fiyat);// fıyat varıable methoda call edıldı
        System.out.println("method call oncesı fiyat = " + fiyat);//100

    }// main sonu



public static void fiyatArttır(double bisey) {
        bisey*=1.24;
    System.out.println("arttırılmıs fıyat= " + bisey);//124
}




}





