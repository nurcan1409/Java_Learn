package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {


        Isci mrb1=new Isci();
        mrb1.maasBılgısı();
        mrb1.maasHesapla();
        mrb1.name="ebuBekır guzel ınsan";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sıgorta();//abs parent classdakı cons meth obj ıle call

IdariPersonel cncCDR=new IdariPersonel();
cncCDR.name="dılek orjıklerın efendısı";
System.out.println("cncCDR.name = " + cncCDR.name);
cncCDR.sıgorta();
cncCDR.maasBılgısı();
cncCDR.maasHesapla();
    }
}
