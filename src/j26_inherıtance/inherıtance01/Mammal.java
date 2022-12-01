package j26_inherıtance.inherıtance01;

public class Mammal extends Hayvancık{// HAYVANCIK PARENT CLASSIN CHILD CLASS-BABA


    public Mammal() { // p.sız cons

        System.out.println("Agam Mammal p.sız cons");

    }

    public void sutBeslenme(){
        System.out.println(" bebelerı sut ıle beslenır");
    }

    public void dogum(){
        System.out.println("bebesını dogurup analık eder");
    }




}
