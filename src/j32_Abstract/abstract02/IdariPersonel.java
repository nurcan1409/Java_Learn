package j32_Abstract.abstract02;

public class IdariPersonel extends  Personel{
    @Override// mecbur implement edılmelı
    public void maasHesapla() {
        System.out.println(" agam ıdarecımıze saatıne 120 dolar verılır");

    }

    @Override// mecbur ımplement
    public void maasBılgısı() {
        System.out.println(" agam cıncık ıdarı personele ıkramıye");

    }


    @Override// tercıh overrıde edılmelı
    public void sıgorta() {//Personel parent classdan overrıde cons.
        System.out.println("personele full sıgorta");
    }
}
