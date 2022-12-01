package EmailCreation;

import java.util.Scanner;

public class EmailApp {

    String firstname;
    String lastname;
    String password;
    String department;
    String email;
    String emailSuffix = "clarusway.com";//sırket domaini dr@clarusway.com
    int mailBoCapacity = 1000;
    int defaultPasswordLenght = 12;


    public EmailApp(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = setDepartmant();
        this.password = setRandomPassWord(defaultPasswordLenght);
        System.out.println("password = " + password);
email=firstname.toLowerCase()+lastname.toLowerCase()+"@"+department+emailSuffix;

    }

    public String setDepartmant() {
        System.out.println("asagıda bulunan departmanlardan bır tane  gırnız...\n" +
                "\n1 test Automatıon \n2 Full stack developer \n3 salesforce \n0 hicbırı");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        if (option == 1) {
            return "testautomation";

        } else if (option == 2) {
            return "fullstackdeveloper";

        } else if (option == 3) {
            return "salesforce";

        } else {

        }


        return "";
    }

    //ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    //int lenght=12;
    public String setRandomPassWord(int lenght) {
        String passWordSet = "//ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }
        return new String(password);

    }
public String showInfo() {
        return "ad-soyad"+firstname+" "+lastname+ "\n"+
                "Sirket email:" +email+"\n"+
                "Password:" + password;
}

}
