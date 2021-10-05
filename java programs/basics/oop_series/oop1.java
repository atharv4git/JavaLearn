package oop_series;

public class oop1 {
    public static void main(String[] args) {
        cars_oop myCar1 = new cars_oop();
        cars_oop myCar2 = new cars_oop();

        System.out.println(myCar1.model);
        System.out.println(myCar1.make);

        myCar1.drive();
        myCar1.brake();

        System.out.println("************************************");

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        myCar2.drive();
        myCar2.brake();
    }
}
