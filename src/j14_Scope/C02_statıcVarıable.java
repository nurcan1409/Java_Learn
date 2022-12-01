package j14_Scope;

import java.util.Stack;

public class C02_statıcVarıable {


    /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */

static String firmaName="claruway";
static int firmaID;
static boolean firmaIT;//GUNES






    public static void main(String[] args) {
        System.out.println("firmaID" +firmaID);

firmaID=1001;// statıc varıable name ıle call edıldı//best practıce
        System.out.println(firmaID);
        firmaName="clarusway";
        System.out.println(firmaName);
        C02_statıcVarıable.firmaIT=true;//clasname ıle statıc cagırdık//bad practıce
        statıcMethod();
        non_statıcMethod();


    }

    public static void statıcMethod() {
        firmaID=2002;
        System.out.println("yenı fırma ID" + firmaID);

    }

public static void non_statıcMethod() {
        firmaName="javacanlar" ;
    System.out.println("yenı name" +firmaName);

}



}

















