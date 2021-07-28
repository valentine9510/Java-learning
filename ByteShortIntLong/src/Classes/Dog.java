package Classes;

//Inheritance, can use variables and functions from another class

public class Dog extends Animal{ //extends calls the base class
    private int eyes,legs, tail,teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //super calls the super class, these are the base characteristics
        this.eyes = eyes;
        this.coat = coat;
        this.teeth =teeth;
        this.tail = tail;
    }

    private void Chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        Chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog run called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog move Legs called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog move called");
        moveLegs(speed);
        super.move(speed);
    }
}
