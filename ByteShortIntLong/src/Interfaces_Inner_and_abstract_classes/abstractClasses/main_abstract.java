package Interfaces_Inner_and_abstract_classes.abstractClasses;

public class main_abstract {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Parrot");
        bird.fly();
        bird.breathe();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
