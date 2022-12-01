package j19_StaticVariable;

import java.util.concurrent.Callable;

public class C06_Clarusway {

    int age;// inst. 33
    static int id;//33

    C06_Clarusway(int i) { // mutahıd parametrelı ,
        id +=i;//33
        age +=i;//33

    }


    public static void main(String[] args) { // önce main calısır

     new C06_Clarusway(33);
       C06_Clarusway hardy =new C06_Clarusway(48) ;

        System.out.println("hardy age:" +hardy.age+ " , hardy id:"+ hardy.id);
            }
        };

























