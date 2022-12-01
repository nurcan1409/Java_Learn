package j32_Abstract.abstract01;

public class Civic extends Lastik {//honda parent abstrack class extend chıld concrete class
    /* extend honda yazılarak honda classa concrete bır cıvıc class tanımlandı
    java CTE verdı
    cozum;
    a)Unımplemented(uyarlanmamıs) method implement edılmelı
    b) parent hond classdan abstrack keyword kaldırılmalı
    c)concrete olan chıld cıvıc class abstract tanımlanmalı
     */

    // concrete classda abstract method tanımlanır mı?
   // public abstract void absMthod(); ya class abs olmalı yada method concrete body olmalı
    //TRICK chıld concrete class parent abs clssın abs methodlarını mutlaka ımplement overrıde etmelı
    @Override
    public void motor() {//implement
        System.out.println("1.6 eco motor az yakar cok kacar");
    }

    @Override
    void koltuk() {//implement
        System.out.println("agam ucuz olsun dıye kumas koltuk temız tutu");

    }

    @Override
    void kapı() {//implement
        System.out.println("5 kapı sedan");

    }


    @Override
    public void LastikEbat() {
        System.out.println("21 inc lastık");

    }

   // Civic obj=new Civic();//honda oglu cıvıc
  //  Civic obj1=new Civic();//cıvıc oglu cıvıc
}

