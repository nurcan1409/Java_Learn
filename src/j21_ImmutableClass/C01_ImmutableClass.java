package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

String str1="nurcan";// ilk degerı nurcan olan str1 varıable
String str2="nurcan";//str1 ve str2 aynı ılk degere sahıp oldugu ıcın strıng havuzundaortak ref atanır
String str3= new String("nurcan");// degerlerı aynı referansları farklı obje
String str4=new String("nurcan");// degerlerı aynı referansları farklı obje
String str5=str1+"";

        System.out.println("str1==str2 = " + str1==str2);//T
        System.out.println("str1==str3 = " + str1==str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3==str4);//F
        System.out.println(str1==str5);//F
        System.out.println(str1.equals(str5));//T

    }
}
