package HalukJava.j10_StringManipulations;

public class C09_İsEmpty {
    public static void main(String[] args) {

           /*
          StringIsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
         */

String str="hı";
        System.out.println(str.isEmpty());
        System.out.println(str.replaceAll(" \\w" , "").isEmpty());

String str1= "1234";
        System.out.println(str1.replaceAll("\\d" , "").isEmpty());





















    }
}
