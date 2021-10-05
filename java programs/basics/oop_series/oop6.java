package oop_series;

public class oop6 {
    public static void main(String[] args) {
        //int[] numbers = new int[3];
        //char[] characters = new char[4];
        //String[] strings = new String[5];
        
        food food1 = new food("pizza");
        food food2 = new food("vada pav");
        food food3 = new food("dosa");
        
        food[] refrigerator = {food1 ,food2 ,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        for(int i = 0 ; i < refrigerator.length ; i++){
            System.out.println(refrigerator[i] + " = " + refrigerator[i].name);
        }

    }
    
}
