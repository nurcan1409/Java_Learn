package j19_StaticVariable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
     // System.out.println(C01_Ogretmen.okul); GUNES DEGERI UPTADE
      C01_Ogretmen hc1=new C01_Ogretmen("nurcan" ,11) ;
        System.out.println(hc1.isim);//nurcan
        System.out.println(hc1.tecrube);//11
      //hc1.okul="abant";// statıc var.obj ıle call edılmez
        System.out.println(hc1.okul);
        C01_Ogretmen.okul="abant";


        C01_Ogretmen hc2=new C01_Ogretmen("bekır",7);
        System.out.println(hc2.isim);
        System.out.println(hc2.tecrube);
        System.out.println(hc2.okul);// statıc var.obj ıle call edlmez
      System.out.println(C01_Ogretmen.okul);


      C01_Ogretmen hc3=new C01_Ogretmen("nur", 6);
        System.out.println(hc3.isim);
        System.out.println(hc3.tecrube);
      System.out.println(hc3.okul);

      hc1.evlilikYıldonumu();// obj ıle nona statıc call
        C01_Ogretmen.maasHesapla();// clas name ıle statıc method call






    }
}
