package j33_Interface;

public class Sahın extends Tofas implements dısDonanım,icDonanım,Lastik{//conc chıld class extens -> tofas ,implements >dıs donanım,icdonanım,lastık
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastık ebat");
        System.out.println("dr bu ne ınsan yıyecek bunu");

    }

    @Override
    public void jant() {
        System.out.println("agam senın gıbı jantı adama celık yakısır");

    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 alıe mootr");

    }

    @Override
    public void yakıt() {
        System.out.println("agam tupitak yoksa ocagın yanar");

    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapısedan");

    }

    @Override
    public void kaporta() {
        System.out.println("agam akordıon kaporta");

    }

    @Override
    public void koltuk() {
        System.out.println("agam derı koltuk yazın terletır");

    }

    @Override
    public void klima() {
        System.out.println("ac camı serınle");

    }
}
