package J00NURCANPROJE;

public class C01Öğrencı extends Kisi {

    private String sinif;
    private int ogrencıNo;

    public C01Öğrencı(String adSoyad, String kimlikNo, int yas) {
        super(adSoyad, kimlikNo, yas);
    }


    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getOgrencıNo() {
        return ogrencıNo;
    }

    public void setOgrencıNo(int ogrencıNo) {
        this.ogrencıNo = ogrencıNo;
    }

    @Override
    public String toString() {
        return "C01Öğrencı{" +
                "sinif='" + sinif + '\'' +
                ", ogrencıNo=" + ogrencıNo +
                '}';







    }
}

