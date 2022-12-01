package Benimjava.J08_İfStatement_TernaryOperator;

public class Proje {

    String name;
    int salary;
    int workHours;
    int year;

    public Proje(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public  double vergiHesapla() {
        double vergi=0;
        if (salary<10000) {
            vergi=0;
        }else
            vergi=salary*0.03;

        return vergi;
    }


    public int ekmesaı() {
        int ekmesaıMıktar=0;
        int saatlıkmesaı=50;
        if (workHours>40 ) {
            ekmesaıMıktar=(workHours-40)*saatlıkmesaı;

        }

        return ekmesaıMıktar;
    }

    public double maasArtışı(){
        int gunumuz=2022;
        int calışmaSuresı=(gunumuz-year);
        double artış=0;

        if (calışmaSuresı<5) {
            artış=(salary+vergiHesapla())*0.05;

        } else if (calışmaSuresı<15) {
            artış=(salary+vergiHesapla())*0.10;


        }else {
            artış=(salary+vergiHesapla())*0.20;
        }
        return artış;

    }
public double toplamMaas() {
        double toplamMaas=maasArtışı()+ekmesaı()+salary;
    return toplamMaas;
}
    @Override
    public String toString() {
        return "Proje{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                "maas" +toplamMaas();

    }
}
