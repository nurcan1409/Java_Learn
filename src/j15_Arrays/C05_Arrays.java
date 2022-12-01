package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //arrayscopy...copy(arr,new



int sayı[]={63,21,54,67,67,89};

int yenıarr[]= Arrays.copyOf(sayı,5);

        System.out.println(Arrays.toString(yenıarr));

int baskaarr[]=Arrays.copyOfRange(sayı,2,4);//2 dahıl 4 e kadar
        System.out.println(Arrays.toString(baskaarr));

       //Arratı belırlı bır eleman ıle update(set)etme...fill(arr,value);
Arrays.fill(sayı,99);
        System.out.println(Arrays.toString(sayı));// hepsını 99 yapar
Arrays.fill(sayı,2,4,33);// indexte olanlar uptade edıldı
        System.out.println(Arrays.toString(sayı));

    }
}
