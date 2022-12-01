package j20_PassByValue;

public class C04_PassByValue {

    static double etıketfıyatı;
    static double ındırımOranı;
    public static void main(String[] args) {

  /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static olarak tanımlanır.
         */


etıketfıyatı=200;
        System.out.println("ındırım oncesı etıketfıyatı:" +etıketfıyatı);
ındırımOranı=0.11;

indir();// mthod call
ındırımOranı=0.22;

indir();
ındırımOranı=0.05;

indir();
        System.out.println(etıketfıyatı);

    }// maın sonu

    public static void  indir(){
        etıketfıyatı*=(1-ındırımOranı);// etıket fıyatı ındırımlı hale getırıldı
        System.out.println("etıketfıyatı = " + etıketfıyatı);

    }

}
