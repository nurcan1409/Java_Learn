package j19_StaticVariable;

public class Task_pass1 {
    public static void main(String[] args) {
        //gırlen fıyata %33 ındırm yapan mrthod create edıp sonucu ındırımlı ve ındırımsız fıyatı prınt edınız
        int fiyat=100;
         Task_pass1 obj=new Task_pass1();
        System.out.println("indirimden oncekı fiyat = " + fiyat);//100
        System.out.println("indir:" + indir(fiyat));//0.67
        System.out.println("indirimden sonrakı fiyat=" +fiyat);//100
    }


    public  static double indir(int fıyat) {
        return fıyat *(0.67);// %33 indirim
    }
}
