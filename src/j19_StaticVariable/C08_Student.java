package j19_StaticVariable;

public class C08_Student {
    static int a;
    int b;

    C08_Student() {
        a+=3;
        b++;
    }

    public static int kareAl() {
        return a*a;
    }

    public static void main(String[] args) {

    C08_Student s1=new C08_Student();
    C08_Student s2=new C08_Student();
    int c=kareAl();
        System.out.println("-a"+c+"-b"+s2.b);





    }
}
