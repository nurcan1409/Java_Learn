package SalaryCalculation;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee("Nurcan", 20000, 41, 2020);
        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.salary = " + employee.salary);

        System.out.println("odenecek vergı:" + employee.tax() + "tl");

        System.out.println("odenecek bonus " + employee.bonus() + "tl");

        System.out.println("maas artısı:" + employee.raiseSalary() + "tl");
        ;

        System.out.println("toplam odenecek tutar = " + (employee.salary) + (employee.raiseSalary()));
        System.out.println("employee.toString() = " + employee.toString());
    }
}