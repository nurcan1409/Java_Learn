package j21_ImmutableClass;

public class C05_OCA_ImmutableClass {
    public static void main(String[] args) {


        String a = "";// immutable varıable a
        String b = "2cfalse";//tanımlanan atanan degerı a ıle aynı havuda olan b varıable
        a += 2;// a=2
        a += 'c';//a=2c
        a += false;//a=2cfalse

        if (a == "2cfalse") {// sart saglamaz ıf calısmaz a referansı "2cfalse"ref yok atama olmadıg ıcın ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }


        String x = "alı";
        String y = "alı";

        if (x == y) {
            System.out.println("referansları aynı x==y");
        }


      //  if (c == b) {
            System.out.println("referansları aynı x==y");


        }
    }
