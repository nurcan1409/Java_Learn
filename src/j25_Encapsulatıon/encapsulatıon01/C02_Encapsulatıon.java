package j25_Encapsulatıon.encapsulatıon01;

public class C02_Encapsulatıon {

   private String name="gamze hanım";
  private int ıd=1001;
//int ıd=1001;
    public C02_Encapsulatıon() {//pojo class
    }


    public C02_Encapsulatıon(String name, int ıd) {
        this.name = name;
        this.ıd = ıd;
    }
public String isimVer(){//getter method

    return name;
}
public int idVer(){// getter method

    return ıd;
}

public void isimDegıs(String isim){
        this.name=isim;
}



    @Override
    public String toString() {
        return "C02_Encapsulatıon{" +
                "name='" + name + '\'' +
                ", ıd=" + ıd +
                '}';
    }
}
