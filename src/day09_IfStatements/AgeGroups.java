package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult 
(40 - 49),
                    Middle-Aged Adult (50 - 
54),
                    Very Young Senior Citizen 
(55 - 64),
                    Young Senior Citizen (65 
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
        int age = 44;
        
        if (1<= age & age <= 2){
            System.out.println("infant");
        } else if (3<= age & age <= 5) {
            System.out.println("toddler");
        } else if (6<= age & age <= 9) {
            System.out.println("kid");
        } else if (10<= age & age <= 12) {
            System.out.println("pre-teen");
        } else if (13<= age & age <= 17) {
            System.out.println("teenager");
        } else if (18<= age & age <= 20) {
            System.out.println("young adult");
        } else if (21<= age & age <= 39) {
            System.out.println("adult");
        } else if (40<= age & age <= 49) {
            System.out.println("young middle aged adult");
        } else  {
            System.out.println("senior");
        }


    }
}
