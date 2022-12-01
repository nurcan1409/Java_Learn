package j26_inherıtance.inherıtance02;

public class Mammal extends Hayvancık {// HAYVANCIK PARENT CLASSIN CHILD CLASS-BABA


    public Mammal() { // p.sız cons

       this('Y');
        System.out.println("mamal p.sız cons ");

    }

    public Mammal(char c){
        super(17);
        System.out.println("mamal p.li cons");
    }

    public void mc (){

        System.out.println("mc - mamal class meth call");
    }

    int m=1;
    int c=4;

    @Override
    public void mM() {
        System.out.println("mM -Mammal class met.call");
    }
}//class sonu
