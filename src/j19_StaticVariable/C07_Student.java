package j19_StaticVariable;

import java.util.concurrent.Callable;

public class C07_Student {


    int studentNo;
    static int studentİd;


    C07_Student() {
        studentİd++;
        studentNo++;
    }

    public static int idVer() {

        return studentİd;
    }

    public int noVer() {

        return studentNo;
    }


    public static void main(String[] args) {

        C07_Student s1=new C07_Student();
        C07_Student s2=new C07_Student();
        C07_Student s3=new C07_Student();
        C07_Student s4=new C07_Student();
        C07_Student s5=new C07_Student();

        System.out.println(s5.noVer());
       // System.out.println(s5.idVer);


            }
        };






















