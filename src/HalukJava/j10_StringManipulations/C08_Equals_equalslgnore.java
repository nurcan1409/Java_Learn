package HalukJava.j10_StringManipulations;

public class C08_Equals_equalslgnore {
    public static void main(String[] args) {

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */
String str1="MERHABA";
String str2="Merhaba";
        System.out.println(str1.equals(str2));//False

        System.out.println(str1.equalsIgnoreCase(str2));

    String s1="songul hanım";
    String s2="songul hanım";

















    }
}
