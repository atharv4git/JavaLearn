import java.util.ArrayList;

public class for_each_loop {
    //for-each loop is a more readable loop
    public static void main(String[] args) {
        //String[] animals = {"dog" , "cat" , "cow" , "goat"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("cow");
        animals.add("goat");

        for(String i : animals){
            System.out.println(i);
        }
    }
}
