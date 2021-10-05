package oop_series.Super_keyword;

public class oop11 {
    public static void main(String[] args) {
        //The super keyword in Java is a reference variable which is used to refer immediate parent class object.Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

        hero hero1 = new hero("Batman",42,"$$$");

        System.out.println(hero1.toString());
                
    }
}
