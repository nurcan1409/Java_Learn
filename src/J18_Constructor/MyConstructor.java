package J18_Constructor;

public class MyConstructor {

int x=3;//4 / 7-4=3
int y=5;//3


    public MyConstructor() {

        x += 1;//4 ins varıable +1 uptade edıldı
        System.out.println("-x = " + x); //-x4


    }

                         //3
    public MyConstructor(int i) {
       this();// p.sız cons call et
       this.y=i;//3  cons.parametresı i degeri inst. varıable y'ye atandı
       x+=y;//4+3=7 // inst.y degerı x degerıne atandı
        System.out.println("-x"+x);//-x7

}
                        //4        3
    public MyConstructor(int i, int i2) {
        this(3);// int paramtrelı cons parametre 3 olarak call edıldı
        this.x-=4;// ins.varıable varıable -4 uptade edıldı
        System.out.println("-x = " + x);//-x3

    }

  public static void main(String[]args) {
        MyConstructor mc1=new MyConstructor(4,3);// 2 int parametre 4 ve 3 atanarak cons. call edıldı

  }


}

