package oop_series;

public class oop7 {
    public static void main(String[] args) {
        
        garage garage = new garage();

        Cars car1 = new Cars("Audi");
        Cars car2 = new Cars("Mercedez");
        Cars car3 = new Cars("BMW");
        Cars car4 = new Cars("Jaguar");
        Cars car5 = new Cars("Range Rover");
        Cars car6 = new Cars("TATA");

        garage.park(car1);

        
    }
}
