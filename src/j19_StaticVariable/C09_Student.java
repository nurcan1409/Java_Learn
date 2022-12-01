package j19_StaticVariable;

import javax.print.DocFlavor;

public class C09_Student {

    int id;
   String name;
   static String bootcamp="clarusway";

   C09_Student(int id, String name, String bootcamp) {
       this.id=id;
       this.name=name;
       this.bootcamp=bootcamp;
   }


    public static void main(String[] args) {

       C09_Student S1=new C09_Student(101,"nurcan", "developer");
       C09_Student S2=new C09_Student(102, "ali","qa");


        System.out.println(S1.id);
        System.out.println(S2.id);

        System.out.println(S1.name);
        System.out.println(S2.name);

        System.out.println(bootcamp);
        System.out.println(bootcamp);

    }
}
