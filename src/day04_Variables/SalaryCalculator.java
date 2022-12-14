package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly rate, weekly hours

        int HourlyRate = 65;
        int WeeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = HourlyRate * WeeklyHours * numberOfWeeks;

        //System.out.println(salary);

        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);





    }


}
