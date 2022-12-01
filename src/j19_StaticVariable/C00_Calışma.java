package j19_StaticVariable;

public class C00_Calışma {

    int num=48;

    public void numChange(int num) {
        num+=100;
    }



    public static void main(String[] args) {

    }


C00_Calışma obj=new C00_Calışma();//psız cons

    public void setObj(C00_Calışma obj) {
        System.out.println("degısmden oncekı num:" + obj.num);//48
        obj.numChange(48);//600
        System.out.println("degısmden sonrakı num:" +obj.num);
    }
}
