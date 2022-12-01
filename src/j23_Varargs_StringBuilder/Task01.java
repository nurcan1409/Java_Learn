package j23_Varargs_StringBuilder;

public class Task01 {
    public static void main(String[] args) {

        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
input:"a","l","i";
output:ali
*/



   String arr1[]= {"m", "e", "r", "v", "e"};
     String arr2[]={"a","l","i"}    ;

strbırlesme(arr1);//merve
strbırlesme(arr2);//alı

strbırlesme("nurcan","enıse");//nurcanenıse

    }// main sonu

    private static void strbırlesme(String...str) {
        String birlesenstr="";
        for (String w:str){
        birlesenstr= birlesenstr.concat(w) ;  
        }
        System.out.println("birlesenstr = " + birlesenstr);
    }


}














