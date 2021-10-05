package oop_series;

public class cars_oop {
        String make = "Audi";
        String model = "A3";
        int year = 2021;
        String colour = "grey";
        double price = 50000.00;
        
        void drive(){
            System.out.println("you drive the car");
        }
        void brake(){
            System.out.println("you stopped the car");
        }


        public String toString(){
            return make + "\n" + model + "\n" + colour + "\n" + year;
        }
}
