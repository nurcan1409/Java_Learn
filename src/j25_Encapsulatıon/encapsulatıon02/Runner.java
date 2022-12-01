package j25_Encapsulatıon.encapsulatıon02;

public class Runner {
    public static void main(String[] args) {
        Kısı obj1=new Kısı("umıt","k",33,"umıtk33");
        System.out.println("obj1.ad = " + obj1.ad);
        obj1.ad="guzel ınsan";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyad = " + obj1.soyad);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());
    }
}
