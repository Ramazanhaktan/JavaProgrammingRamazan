package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

      //  Person person = new Person("Josh", 23, 'M');
      //    Employee employee = new Employee("Ali", 30, 'M', 42);

        Tester tester = new Tester("Ramazan", 34, 'M', 123, "SDET", 80000);

        System.out.println(tester);
        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();



    }



}
