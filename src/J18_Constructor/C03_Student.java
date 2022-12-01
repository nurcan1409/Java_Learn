package J18_Constructor;

public class C03_Student { //main olmayan sadece student obj create etmek ıcın poja-> plan old java object
//FİELDS
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;



public void mezunıyet() {
    if (ortalama>=50) {
        System.out.println("tebrıkler gectın");
    } else System.out.println("seneye bır daha beklerız");
}

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}



