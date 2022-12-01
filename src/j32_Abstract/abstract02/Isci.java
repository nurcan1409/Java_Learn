package j32_Abstract.abstract02;

public class Isci extends Personel{//abs personel parent clas'a extends ->concr
    @Override
    public void maasHesapla() {//personel parent classdan overrıde
        System.out.println(" agam yevmıye 500 tl verılır");

    }

    @Override
    public void maasBılgısı() {//personel parent classtan overrıde
        System.out.println("agam cay sıgara harıc gunde 8 saat calısır");

    }
}
