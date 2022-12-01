package j15_Arrays;

import java.util.Arrays;

public class C08_Calışmalar {
    public static class Ex123 {
        public static void main(String[] args) {

            int sayıArr[] = new int[5];
            sayıArr[0] = 20;
            sayıArr[1] = 25;
            sayıArr[2] = 20;
            sayıArr[3] = 23;
            String isimArr[] = {"nurcan", "ali", "selım", "pınAR"};
            System.out.println(sayıArr[0]);
            System.out.println(sayıArr[1]);
            System.out.println(sayıArr[2]);

            System.out.println(isimArr.length);
            System.out.println(isimArr.length - 1);
            sayıArr[8] = 50;
            System.out.println(sayıArr[8]);//rte verdı

            // sayıarr elemeanlarından degerı tek olanları prınt eden code create eedınız

            for (int i = 0; i < sayıArr.length; i++) {
              if(sayıArr[i]%2==1) {

                  System.out.println(sayıArr[i]);
              }
            }
        }
    }

    public static class Ex14 {
        public static void main(String[] args) {

            int[][]sayılar=new int[2][3];
            sayılar[0][0]=5;
            sayılar[0][1]=4;
            sayılar[0][2]=6
            ;
            sayılar[1][0]=10;
            sayılar[1][1]=8;
            sayılar[1][2]=9;
            System.out.println(sayılar[0][0]);
            System.out.println(sayılar[0][1]);
            System.out.println(sayılar[0][2]);
            System.out.println(sayılar[1][1]);

    int[][]notlar=new int[3][5];
    notlar[0][0]=50;
    notlar[0][1]=40;
    notlar[0][2]=60;

            System.out.println(notlar[0][0]);
            System.out.println(notlar[0][1]);
            System.out.println(notlar[0][2]);




        }
    }

    public static class Ex_222 {
        public static void main(String[] args) {

           double a=5;

           String b="6";
            System.out.println(a+b);
            System.out.println(a*3+7/4);














        }
    }

    public static class Ex_Elly {
        public static void main(String[] args) {

    /*
          given an int array and find the squares of the elements
          (Verilen bir int dizisi icin elemanlarin karelerini bulun )
          Example:{2,6,4,5,8,9}
          output:{4,36,16,25,64,81}*/


            int arr[]={2,6,4,5,8,9};
           for (int i=0; i< arr.length; i++) {
               arr[i] *=arr[i];
               System.out.println(Arrays.toString(arr));

           }





















        }}

    public static class Ex_Elly1 {
        public static void main(String[] args) {

            /*
             * write a java program that calculates the average value of array elements
             * Print elements that are greater than avarage
             * (dizi elemanlarinin ortalamadan buyuk olan elemanlarını hesaplayan ve
             * onlari yazdıran bir java programi yazin)
             * input[]= {1,2,3,4,5,6,7}
             * Output : 4
             */


            int arr [] = {1,2,3,4,5,6,7};

            int toplam = 0;
            for (int i = 0; i < arr.length; i++) {
                toplam+=arr[i];
            }

            double ortalama = toplam/arr.length;
            System.out.println("ortalama = " + ortalama);
            System.out.println("ortalamadan buyuk olan elemanlar");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > ortalama) {
                    System.out.print(arr[i] + " ");


                }
            }}}

    public static class EX_elly2 {
        public static void main(String[] args) {



           /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     //*/
          //  public static void main(String[]for (String arg : args) {

            }
             {
                /*  you have a string "HeySiri"
                 * with arrays change it to "ByeSiri" and write changing array
                 *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
                 *
                 */
                //    //1.adim str tanimladik
                //    String str = "HeySiri";
    //
                //    //2.adim HeySiri yi ByeSiri ye donustur
                //    str =str.replace("Hey", "Bye");
                //    System.out.println(str);
    //
                //    String arr[] = new String[1];
                //    arr[0] =str;
                //    System.out.println(Arrays.toString(arr));
                //2.yol
                String str1 = "HeySiri";
                String yeniStr [] = str1.split("y");
                System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
                yeniStr[0] = "Bye" ;
                System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]
                str1 =yeniStr[0] +  yeniStr[1];
                System.out.println("str1 = " + str1);
                String arr2[] = new String[1];
                arr2[0] = str1;
                System.out.println(Arrays.toString(arr2));




        }




    }

    public static class Ex_Elly3 {
        public static void main(String[] args) {


            /*
             * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
             * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
             * istenenToplam=9;
             */


     int[] arr={5,7,-6,4,2,15,3,8,1};
     int istenentoplam=9;
     toplamdokuz(arr,istenentoplam);












        }

        private static void toplamdokuz(int[] arr, int istenentoplam) {
            for (int i=0; i<arr.length; i++) {
                for (int j=i+1; j<arr.length; j++){
                    if(arr[i]+arr[j]==istenentoplam) {
                        System.out.println(arr[i]+ "ve" +arr[j]+ "toplam :"  +istenentoplam );
                    }
                }
            }



        }


    }

    public static class Ex_Elly4 {
        public static void main(String[] args) {



















        }
    }
}
