package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Batch EU10";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public final static void main(String[] args) {

        final double pi = 3.14;

       // pi = 4.14; final variables can not be reassigned
       // pi = 5.4;

        final String name;
        name = "Java";
       // name = "Woodenspoon";
        System.out.println(name);

        System.out.println("----------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
       // obj.birthDay = "June/01"; final variables can not be reassigned
        System.out.println(obj.birthDay);

        System.out.println("----------------------------------");

       // FinalVariable.name = "Python";  final variables can not be reassigned
        System.out.println(FinalVariable.name);

















    }
}
