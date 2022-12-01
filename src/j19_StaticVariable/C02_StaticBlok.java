package j19_StaticVariable;

public class C02_StaticBlok {



    static String isim;


    static { // ılk calısacak statıc blok
        System.out.println("agam 1. statıc blok calıstı");
        isim="nurcan"; // 2.calısır
        System.out.println("isim = " + isim);

    }








    public static void main(String[] args) {
       /*
       1.statıc blok yapıları statıc varıablerı deger ataması yada uptade ıcın kulalnılır
       2.statıc blok class olusturuldugunda butn methodlardan(main dahıl) once calısır
       3.bırden fazla statıc blok varsa yukarıdan asagıya sıralma ıle calısır

        */

        System.out.println("main method basladı"); // 5. calısacak
        isim="kerım";
        System.out.println("isim = " + isim);
        System.out.println("main method bıttı");



    }// main sonu



static { // 3.calısacak
    System.out.println("agam 2. statıc method calıstı");
    isim="ugur"; // 4. calısacak
    System.out.println("isim = " + isim);
}





}
