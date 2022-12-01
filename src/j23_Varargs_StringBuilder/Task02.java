package j23_Varargs_StringBuilder;

public class Task02 {
    public static void main(String[] args) {

// Task> gırılen ılk sayı harıc dıgerlerını toplayan ve toplam ıle ılk sayıyı capan method create edınız
        System.out.println("toplaCarp(2,24,38,21,59,26) = " + toplaCarp(2, 24, 38, 21, 59, 26));
int arrtop[]={2,24,38,21,59,26};
        System.out.println("arrtop(3,arrtopla = " + toplaCarp(2,arrtop));

    } // main sonu
public static int toplaCarp(int carpılacakSayı,int...toplanacakSayılar) {
    int toplam = 0;
    for (int a : toplanacakSayılar) {
        toplam += a;
    }
    System.out.println("sonuc = " + carpılacakSayı * toplam);

    return carpılacakSayı*toplam;
}

    }





