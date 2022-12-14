package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ali", 'M', 28, 110000);

        System.out.println(employee1);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);

        employee2.setName("Hulya");

        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee2);





    }
}
