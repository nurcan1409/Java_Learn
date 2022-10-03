package Benimjava.J07_Logical_Mantıksal_Operators;

public class C01_MantıksalOperators {
    public static void main(String[] args) {


boolean b1=true;
int a=3;
int c=7;
        System.out.println(b1&(a<c));
        System.out.println(b1&&(a>c));
        System.out.println(b1&(a==c));

 boolean s1=false;
 int h=8;
 int m=9;
        System.out.println(s1||(h<m));
        System.out.println(s1||(h>m));
        System.out.println(s1||(h==m));



        System.out.println(!(s1||(h<m)));
        System.out.println(!(s1||(h>m)));
        System.out.println(!(s1||(h==m)));







    }
}
