package j23_Varargs_StringBuilder;

public class Task03 {
    public static void main(String[] args) {

/*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */

int sayı=5;
String str1="muharrem ";
String str2="nurcan";
String str3="ayse";
carpStrıngEnuzun(sayı,str1,"selam ",str2,str3);

    }// main sonu


public static void carpStrıngEnuzun(int carpacaksayı,String ...str){
        String enuzun="";
        for (String a:str){
            if (a.length()>enuzun.length()) {
                enuzun=a;
            }


        }

    System.out.println("agam ıstedıgn deger = " + carpacaksayı*enuzun.length()+" "+enuzun);

}





}
