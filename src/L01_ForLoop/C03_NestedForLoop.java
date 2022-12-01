package L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //eger bır dongunun badısınde baska bır dongu bulunuyorsA bu tur dongulere ıc ıce dongu nested denır
//ic dongu dıs dongunun her adımında tekrar calısır
        //icice dongulerde en ıctekı ılk once calsır


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "dıs dongu");

            for (int j=1; j<=6; j++); {

                System.out.println( "ic dongu");
            }

        }


    }

}