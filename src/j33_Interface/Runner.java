package j33_Interface;

public class Runner {
    public static void main(String[] args) {

        Sahın dgsahn=new Sahın();
        dgsahn.ebat();
        dgsahn.jant();
        dgsahn.kapi();
        dgsahn.kaporta();
        dgsahn.klima();
        dgsahn.koltuk();
        dgsahn.motor();
        dgsahn.sislamp();//default conc. method obj ıle call
        dgsahn.sunroof();
        dgsahn.yakıt();
        System.out.println("dısDonanım.renk = " + dısDonanım.renk);
        //icDonanım.kumas="deri";//CTE fınal varıable atama yapılmaz
        System.out.println("icDonanım.kumas = " + icDonanım.kumas);
        System.out.println("icDonanım.renk = " + icDonanım.renk);
        System.out.println("Lastik.renk = " + Lastik.renk);//aynı ısımlı varıableler ınterface name ıle call edılır
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);



    }
}
