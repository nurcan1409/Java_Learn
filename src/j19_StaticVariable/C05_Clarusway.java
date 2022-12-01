package j19_StaticVariable;

public class C05_Clarusway {

    static int id=1000;
    public void idAta() {
        id++;

    }



    public static void main(String[] args) {

C05_Clarusway hardy= new C05_Clarusway();
C05_Clarusway jack =new C05_Clarusway();
hardy.idAta();
jack.idAta();


    }



}
