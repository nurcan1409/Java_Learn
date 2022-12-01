package j17_ForEachLopp;

public class C02_ForEachLopp {
    public static void main(String[] args) {
        
        //task array elemanlarının carpımını prınt eden code create edınız 
        int arr[][]={{2,3}, {4}, {5,6,7}};
        int crpm=1;
        for (int kc[] :arr) {
            for (int a:kc) {
                crpm*=a;
                
            }
        }
        System.out.println("crpm = " + crpm);
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
