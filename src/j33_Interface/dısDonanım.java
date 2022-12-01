package j33_Interface;

public interface dısDonanım {

    public void kapi();//abs.method

   abstract void kaporta();// abs.method

    String renk="opak kırmızı"; // publıc statıc fınal varıable

    public default String sislamp(){
        return "sisli havaya dıkkat";
    }

    static void aga() {
        System.out.println("agam sensız olmaz");
    }
 //   public static default void  sorunMethod() {}//CTE statıc default keyword aynı anda kullanılamaz

   // dısDonanım obj=new icDonanım() { //obj olmazzz

  //  public static void main(String[] args) {

     //   System.out.println("renk = " + renk);
     //   aga();// statıc method call




    }







