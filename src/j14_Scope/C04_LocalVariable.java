package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {
        int yas = 33;
        System.out.println("yas" + yas);
        for (int i = 0; i < 7; i++) {//for bası
            System.out.println(yas + " ");

        }// forsonu
yas=35;//local varıable localınde call edıldı

    }

// yas=48 local dısı call edılemez



}