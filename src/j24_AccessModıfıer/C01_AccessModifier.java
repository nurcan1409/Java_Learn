package j24_AccessModıfıer;

public class C01_AccessModifier {
    public static void main(String[] args) {

/*
     1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
     Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */

    }

    private int privateYas = 24;
    int defaultYas = 33;//access modofıer yazılmazsa default olarak tanımlanır
    protected int protectedYas = 40;
    public int publicYas = 48;


    private C01_AccessModifier() {//prıvate p.siz cons.
        System.out.println("agam prıvatecons.selam");

    }


    public C01_AccessModifier(int privateYas, int defaultYas) {// publıc 2 paramtrelı cons.
        System.out.println("agam publıc cons.selam");

    }

private void privateMethod(){// ancak kendı clasından call edılır
    System.out.println("private method agaya selam");
}


protected void protectedMethod() {
    System.out.println("protected methoddan agaya selam");
}

C01_AccessModifier obj3=new C01_AccessModifier();// prıvate cons call edıldı



}