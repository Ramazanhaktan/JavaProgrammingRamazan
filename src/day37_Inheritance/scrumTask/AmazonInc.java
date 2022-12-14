package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Rabia", 28, 'F', "QA", 4, 120000, company);
        Tester tester2 = new Tester("Yasemin", 29, 'F', "QA", 5, 110000, company);
        Tester tester3 = new Tester("Ayse", 27, 'F', "QA", 6, 150000, company);
        Tester tester4 = new Tester("Fatma", 26, 'F', "QA", 7, 130000, company);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Hulya", 28, 'F', "developer", 8, 110000, company);
        Developer developer2 = new Developer("Turkan", 28, 'F', "developer", 9, 115000, company);
        Developer developer3 = new Developer("Rabia", 28, 'F', "developer", 10, 130000, company);
        Developer developer4 = new Developer("Busra", 28, 'F', "developer", 11, 120000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("---------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("---------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }

    }

}
