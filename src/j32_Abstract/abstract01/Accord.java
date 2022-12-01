package j32_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {//implement
        System.out.println("hızı felaket");
    }

    @Override
    void koltuk() {//implement edılen abs method
        System.out.println("deri koltuk ter yapar");

    }

    @Override
    void kapı() {//implement
        System.out.println("vakumlu kapı dıkkat");

    }

    @Override
    void sunrooff() {
        System.out.println(" ");
    }
}

