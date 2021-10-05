package oop_series;

public class oop2 {
    public static void main(String[] args) {
        Human human1 = new Human("Popat Lal",45,85);
        Human human2 = new Human("Goli",15,39);
        
        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}
