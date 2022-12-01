package J00NURCANPROJE;

public class C02Öğretmen {
    private String bolum;
    private String sıcılNo;

    @Override
    public String toString() {
        return "C02Öğretmen{" +
                "bolum='" + bolum + '\'' +
                ", sıcılNo='" + sıcılNo + '\'' +
                '}';
    }


    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSıcılNo() {
        return sıcılNo;
    }

    public void setSıcılNo(String sıcılNo) {
        this.sıcılNo = sıcılNo;
    }
}
