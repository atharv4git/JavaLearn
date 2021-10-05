import java.util.ArrayList;
//import java.util.concurrent.ArrayBlockingQueue;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("dosa");
        food.add("vadapav");

        for(int i = 0 ; i<food.size(); i++){
            System.out.println(food.get(i));
        }
System.out.println("********************************");
        /*
        for (String element : food) {
            System.out.println(element);        //enhanced for loop
        }
        */


        food.set(0, "paani poori");

        for (String element : food) {
            System.out.println(element);        //enhanced for loop
        }
System.out.println("********************************");

        food.remove(2);
        for (String element : food) {
            System.out.println(element);        //enhanced for loop
        }
System.out.println("********************************");


        food.clear();
        for (String element : food) {
            System.out.println(element);        //enhanced for loop
        }
        
    }
    
}
