package Interfaces_Inner_and_abstract_classes.innerClasses;

public class main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
