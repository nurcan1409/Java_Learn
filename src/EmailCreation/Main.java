package EmailCreation;

public class Main {
    public static void main(String[] args) {
        EmailApp emailApp=new EmailApp("nurcan","f");
        System.out.println("emailApp.setDepartmant() = " + emailApp.setDepartmant());
        System.out.println("emailApp.showInfo() = " + emailApp.showInfo());

    }
}
