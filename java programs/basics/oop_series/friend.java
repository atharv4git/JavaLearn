package oop_series;

public class friend {
    
    String name;
    static int numberOfFriends;

    friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends you asshole");
    }
}
