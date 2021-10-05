package oop_series.abstract_class;

public class oop12 {
    public static void main(String[] args) {
        //A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body). A layer of security.

        //Abstraction is a process of hiding the implementation details and showing only functionality to the user.

        //Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

        car car1 = new car();
        //vehicle vehicle1 = new vehicle(); -->> cannot create vehicle cpz its too generic/abstract

        car1.go();
        
    }
    
}
