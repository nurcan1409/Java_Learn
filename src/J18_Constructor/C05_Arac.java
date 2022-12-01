package J18_Constructor;

public class C05_Arac { // obj kalıphanesı

    //Fields-> obj'nin uretilirken alacgı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */


    int maxHız;//180 sonra 210
    String model;// hacımurat


    public C05_Arac() {// paramtresız cons ezik:)
    }

    public C05_Arac(int maxHız, String model) {// 2 li cons.
        this.maxHız = maxHız;//180
        this.model = model;// hacımurat
        System.out.println("agam bu yazıyı okuduysan 2 lı cons call edılmıstır");
    }

                        //210
    public C05_Arac(int maxHız) {// bır parametrelı cons
        this(180,"hacıMurat");// 2 paremtrelı cons. call edıldı.ilk satıra yazılmalıyoksa cte verır
        this.maxHız=maxHız;//thıs olmadıgı ıcın paramtre degerı ınst.
        // varıable atanmaz obj maxhız degerı ınst.varıabledekı default deger alır
        //this.maxhız//>this keyword parametre degerı ins varıable atama yapar
    }// obj maxhızdegerı  paramtreden alır

    public C05_Arac(String model, int maxHız) {//2 li cons parametre sırası farklı
        this.model = model;
        this.maxHız=maxHız;
    }


    }



