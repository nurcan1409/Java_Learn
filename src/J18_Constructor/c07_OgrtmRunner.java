package J18_Constructor;

public class c07_OgrtmRunner {
    public static void main(String[] args) {

      C07_Ogrtm hcm=new C07_Ogrtm("nurcan ogretmen" ,11)  ;
        System.out.println(hcm.isim);//nurcan ogretm
        System.out.println(hcm.kıdem);//5
        hcm.kıdemHesapla(13);//26


    }
}
