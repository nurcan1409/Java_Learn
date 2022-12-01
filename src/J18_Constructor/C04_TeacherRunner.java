package J18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher ogretmen1 = new C04_Teacher();// ogretmen1 obj create edıldı
        ogretmen1.ad = "nurcan";
        ogretmen1.soyad = "guzel";
        ogretmen1.emeklı = false;
        ogretmen1.maaş = 20000;
        ogretmen1.tecrube = 11;
        ogretmen1.derssaatı();
        System.out.println("ogretmen1 = " + ogretmen1);

        C04_Teacher ogretmen2 = new C04_Teacher("ugur", "yaslı", 15, 200, 333, false);
        System.out.println(ogretmen2);
    }





    }
