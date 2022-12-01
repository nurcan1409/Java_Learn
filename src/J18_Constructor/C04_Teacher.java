package J18_Constructor;

public class C04_Teacher {

    String ad;
    String soyad;
    int tecrube;
    double maaş;
    int id;
    boolean emeklı;

    public void derssaatı() {
        System.out.println("agam ekstraya gırer");
    }

    public C04_Teacher() { // p.li ezdıgı default yerıne p.sız con create edıldı
    }

    //Trick p.li cond default consu ezer
    public C04_Teacher(String ad, String soyad, int tecrube, double maaş, int id, boolean emeklı) {
        this.ad = ad;
        this.soyad = soyad;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emeklı = emeklı;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emeklı=" + emeklı +
                '}';
    }
}


