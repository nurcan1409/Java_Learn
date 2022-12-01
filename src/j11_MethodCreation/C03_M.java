package j11_MethodCreation;

public class C03_M {
    public static void main(String[] args) {

        String str = "javaya selam";

        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf("c", 3));
topla('a' ,24);
topla(3 ,14);
topla(3.14 ,34);

    }

    public static void topla(int sayı1, int sayı2) {
        System.out.println("int-int type metot calıstı" + (sayı1 + sayı2));

    }


    public static void topla(int sayı1, double sayı2) {
        System.out.println("int-double type metot calıstı" + (sayı1 + sayı2));

    }

    public static void topla(double sayı1, double sayı2) {
        System.out.println("double-double type metot calıstı" + (sayı1 + sayı2));

    }







}