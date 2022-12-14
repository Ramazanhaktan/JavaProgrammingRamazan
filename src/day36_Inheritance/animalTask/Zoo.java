package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 2, "black");
        dog.eat();
        dog.drink();
        dog.bark();
        dog.move();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'F', "medium", 3, "white");
        cat.eat();
        cat.drink();
        cat.meow();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', "big", 5, "red");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.roar();

        System.out.println(tiger);


    }

}
