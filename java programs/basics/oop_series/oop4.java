package oop_series;

public class oop4 {
    public static void main(String[] args) {
        //Java Constructor overloading is a technique in which a class can have any number of constructors that differ in parameter list. The compiler differentiates these constructors by taking into account the number of parameters in the list and their type.

        Pizza pizza = new Pizza("thicc crust");

        System.out.println("Here are the ingredients of your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

    }
}
