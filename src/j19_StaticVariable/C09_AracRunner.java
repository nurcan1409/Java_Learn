package j19_StaticVariable;

public class C09_AracRunner {
    public static void main(String[] args) {

        C09_Arac mycar=new C09_Arac();
        mycar.marka="volvo";
        mycar.model="sx10;";
        mycar.fıayt=23000;
        mycar.km=300;
        mycar.kazakaydı=false;
        System.out.println(mycar.marka);
        System.out.println(mycar.model);
        System.out.println(mycar.kazakaydı);
        System.out.println(mycar.fıayt);
        System.out.println(mycar.km);

        C09_Arac.ortalamaYakıt(12000,12);

      C09_Arac.sıgortaHesaplama(2014,14);

    }



}
