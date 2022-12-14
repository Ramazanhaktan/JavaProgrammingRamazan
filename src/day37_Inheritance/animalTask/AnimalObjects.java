package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky",'M', "small", 2, "black");

        System.out.println(dog1);
        dog1.bark();
        dog1.drink();

        Cat cat1 = new Cat("Love", "Siamese", 'F', "big", 3, "white");

        System.out.println(cat1);

        Parrot parrot1 = new Parrot("Luan", "chinese", 'M', "medium", 4, "brown");

        System.out.println(parrot1);

    }



}
