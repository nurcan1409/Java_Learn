package j26_inherıtance.inherıtance02;

public class Kedi extends Mammal {// Mammal parent class Mammal chıld-torun
    /*chıld class obj olmadan parent class varıable ve methodlara ulasabılır */

    public Kedi() {
        super();

        System.out.println("agam kedı p.sız cons");


    }


public Kedi(String str) {
        this();
    System.out.println("super c ");
    System.out.println(" kedı p.li cons");
}
    int c=2;
    int d=5;

    @Override
    public void mc() {
        System.out.println("mc - mc mthod call edıldı");
    }
}
