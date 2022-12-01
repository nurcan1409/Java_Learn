package J18_Constructor;

public class C01_Constructor {

    String str;// ıns.varıable->obj varıable
    String selam = "guzel ınsan";


    //C01_Constructor obj1 = new C01_Constructor() ;

    public static void main(String[] args) {

          /*
    1- consturctor ismi Calss name ile aynı olmalı.Buyuk harf ile başlamalı
    2- constructor creta eedildiğinde name den sonra () {} mutlaka kullanılmalı
    3- eger parametre'li cons. create edildiğinde java default cons ezer(siler)
    4- cons. return type olmaz method'dan ayıran özelliğidir.
    5-Class oluştugunda java default cons. kendi create eder.
     */

        //  class name        obj name      new keyword           default cons.

                  C01_Constructor obj1=new C01_Constructor();
                  C01_Constructor obj2=new C01_Constructor();
                  C01_Constructor obj3=new C01_Constructor();
                  C01_Constructor obj4=new C01_Constructor();

obj1.str="javacan";// str ıns.varı.obj1 ıle call edılerek obj1 degerı atandı
obj2.str="javatar";// str ıns.varı.obj2 ıle call edılerek obj2 degeru atandı

        System.out.println(obj3.selam);
        System.out.println(obj1.str);// javacan
        System.out.println(obj2.str);//javatar
        System.out.println(obj4.str);// null
        obj3.aga();// agaya selam
        obj2.aga();// agaya selam




    };// maın sonu

    public  void aga(){
        System.out.println("agaya selam");


    }}