package j25_Encapsulatıon.encapsulatıon03.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) { //ana class

         /*
        Burada iki adet class vardır. Biri Main, diğeri ise student ,
        student classı içinde;
        String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

        Main classın içinde;
        girilen değerleri aşagıdaki gibi print eden code create ediniz
        Örnek:
        age 12'dir.
        name Steven'dır.

        name(isim) olarak;
        "Student name is Steven"
        ve
        age(yaş) olarak da;
        "He is 12 years old"


     */
// gırılen degerler;
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("adınızı gırınız");
        String ad=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("yasınızı gırınız");

     Student s1=new Student();






    } //maın sonu





}//class sonu
// String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.
class student{// student class ->ınner class
   private Student name;
   private int age;

    public student(Student name, int age) {
        this.name = name;
        this.age = age;
    }


    public Student getName() {
        return name;
    }

    public void setName(Student name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; */
    }
}