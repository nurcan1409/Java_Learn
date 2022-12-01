package J18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrc1 = new C03_Student();
        ogrc1.ad = "fatıh";
        ogrc1.soyad = "ataş";
        ogrc1.sınıf = 1;
        ogrc1.okulNo = 1001;
        ogrc1.ortalama = 77;
        ogrc1.takdir = false;
        System.out.println(ogrc1);//J18_Constructor.C03_Student@6442b0a6
//C03_Student{ad='fatıh', soyad='ataş', sınıf=1, ortalama=77.0, okulNo=1001, takdir=false}
       ogrc1.mezunıyet();// tebrıler gectın

        System.out.println(ogrc1);

// Task bır ogrencı obj tum fıeldlerı prınt edınız

      C03_Student ogrnc2=new C03_Student();
      ogrnc2.ad="nurcan";
      ogrnc2.soyad="yerlıkaya";
      ogrnc2.okulNo=143;
      ogrnc2.takdir=true;
      ogrnc2.ortalama=20;
        System.out.println(ogrnc2);
ogrnc2.mezunıyet();

    }















}