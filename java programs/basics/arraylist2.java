import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        for(int a : arr){
            System.out.println(a);
        }

        /*for(int i = 1; i<= 4 ; i++){
            System.out.println(arr.get(i));
        }*/



    }
}
