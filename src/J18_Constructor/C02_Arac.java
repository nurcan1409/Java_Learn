package J18_Constructor;

public class C02_Arac {

String marka;
String model;
int km=10;
double motorhc;
boolean vıtes=false;
boolean ikinciEl;
int yıl;



    public static void main(String[] args) {

C02_Arac arac1=new C02_Arac() ; //default cons ıle arac1 obj create edılır

arac1.ikinciEl=true;
arac1.marka="volva";
arac1.km=5000;
arac1.motorhc=2.4;
arac1.model="xc60";
        System.out.println("arac1.marka+\" \"+arac1.model+\" \"+arac1.motorhc+\" \"+arac1.ikinciEl = " + arac1.marka+" "+arac1.model+" "+arac1.motorhc+" "+arac1.ikinciEl);
       

//2. bır aracın tum fıeldlerını atayarak create edınız fıelds=deger alanları demek

C02_Arac mycar=new C02_Arac();

        mycar.ikinciEl=false;
        mycar.marka="sahin";
        mycar.km=6000;
        mycar.motorhc=3.4;
        mycar.model="xc60";
        System.out.println("mycar = " + mycar.marka+" "+mycar.model+" "+mycar.motorhc+" "+mycar.km+" "+mycar.ikinciEl);


// 3.aracın tum fıeldlerını atayarak create edınız

        C02_Arac arac2=new C02_Arac();
        arac2.model="dogan";
        arac2.marka="xc400;";
        arac2.km=30;
        arac2.ikinciEl=true;
        //System.out.println(" = " +arac2.marka+" "+arac2.model+" "+arac2.ikinciEl+" " +arac2.km);
            System.out.println("arac2 = " + arac2);

    }

        @Override
        public String toString() {
                return
                        "marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", km=" + km +
                        ", motorhc=" + motorhc +
                        ", vıtes=" + vıtes +
                        ", ikinciEl=" + ikinciEl +

                        '}'; }}


                
