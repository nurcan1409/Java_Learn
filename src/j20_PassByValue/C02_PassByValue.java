package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

// task verılen fıyat ıcın %11 %22 ve %33 indirimli fıyatı prınt eden methodlar create edınız

double fıyat=100;
        System.out.println("method call oncesı fıyat = " + fıyat);
        System.out.println(indir11(fıyat));
        System.out.println(indir22(fıyat));
        System.out.println(indir33(fıyat));

        System.out.println("method call sonrası fıyat = " + fıyat);

    }// maın sonu

    private static double indir33(double fıyat) {// gırılen fıyatın %33 indrımlı halı
        return fıyat*=0.67;// fıaytın %67 sını return eden method
    }

    private static double indir22(double fıyat) {
        return fıyat*=0.78;
    }

    private static double indir11(double fıyat) {
        return fıyat*=0.89;
    }


}



