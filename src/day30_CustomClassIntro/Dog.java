package day30_CustomClassIntro;

public class Dog {

        public String name;
        public String breed;
        public int age;
        public char gender;
        public String color;
        public String size;


        public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
                name = dogName;
                breed = dogBreed;
                age = dogAge;
                gender = dogGender;
                size = dogSize;
                color = dogColor;
        }


        public void eat(){
            System.out.println(name + " is eating");
        }

        public void bark(){
            System.out.println(name + " is barking");
        }

        public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", breed='" + breed + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", color='" + color + '\'' +
                        ", size='" + size + '\'' +
                        '}';
        }
}

/*
Attributes:
        name, age, gender, breed, size, color

Actions:
        eat(), play(), bark(), .....

 */

