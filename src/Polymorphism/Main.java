package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Animal[] animals = new Animal[] {dog, cat, bird};

        for (Animal animal : animals)
            animal.makeSound();

//        int [] numbers = new int[] {1,2,3,4,5};
//
//      ex.#01  for (int i : numbers)
//            System.out.println(i);

//      ex.#02 for (int i=0; i < numbers.lenght; i++)
//            System.out.println(i);
    }
}
