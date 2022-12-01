package j23_Varargs_StringBuilder;

public class C03_Task01 {
    public static void main(String[] args) {

/*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */
        System.out.println("tersString(\"ece\") = " + tersString("ece"));
        System.out.println("tersString(\"serhat\") = " + tersString("serhat"));
        StringBuilder sb1=new StringBuilder("ali");
        tersSB(sb1);
tersSB(new StringBuilder("serhat"));

    }// main sonu

    public static String tersString(String str) {// amele code
        String stringTersi="";
        for (int i=str.length()-1; i>0; i--) {
            stringTersi+=str.charAt(i);
        }
        return stringTersi;
    }

    public static void tersSB(StringBuilder sb) {
        System.out.println("sb.reverse() = " + sb.reverse());//sb ters cevırme

    }

public static boolean isPalindrom (String str) {
        if ( str== null) {
            return false;

        }


    return new StringBuilder(str).reverse().toString().equals(str);
}



}
