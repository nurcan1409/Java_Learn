package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C09_CALISMA {
    public static void main(String[] args) {



      int arr[]={10,11,12};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        String takım[]= new String[3];
        takım[0]="ali";
        takım[1]="asım";
        takım[2]="ızzet";
      takım[0]="nurcan";
        System.out.println("Arrays.toString(takım) = " + Arrays.toString(takım));
        System.out.println("takım.length = " + takım.length);
        
        int arr1[]={10,25,3,16,75};
        Arrays.sort(arr1);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
        System.out.println("Arrays.binarySearch(arr1,10) = " + Arrays.binarySearch(arr1, 10));
        System.out.println("Arrays.binarySearch(arr1,30) = " + Arrays.binarySearch(arr1, 30));
        System.out.println("Arrays.binarySearch(arr1,80) = " + Arrays.binarySearch(arr1, 100));

        String arrayStrıng=Arrays.toString(arr1);
        System.out.println("arrayStrıng = " + arrayStrıng);
        System.out.println("arrayStrıng.substring(5) = " + arrayStrıng.substring(5));

        String str="herkes javayı sever";
        String arr2[]=str.split("a");
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        int arra[]={10,25,5,20};
        int arrb[]={25,10,20,5};
       Arrays.sort(arra);
       Arrays.sort(arrb);
        System.out.println("Arrays.equals(arra,arrb) = " + Arrays.equals(arra, arrb));
    }

    }

