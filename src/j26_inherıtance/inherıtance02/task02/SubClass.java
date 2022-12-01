package j26_inherıtance.inherıtance02.task02;

public class SubClass extends SuperClass{
    int num=10;
public void my_method() {
    goster();
 super.goster();
    System.out.println("subclass num = " + num);
    System.out.println("superclass num=" +super.num);

}


    public  void goster(){
        System.out.println("bu method sub clasının goruntuleme methodudur");



    } }














