import java.util.ArrayList;

public class twoD_arraylist {
    public static void main(String[] args) {
        //2D aArrayList = a dynamic list of lists
        //we can change the size of these lists during runtime

        ArrayList<ArrayList<String>> GroceryList = new ArrayList<>();
        
        ArrayList<String> BakeryList = new ArrayList<>();
        BakeryList.add("pasta");
        BakeryList.add("bread");
        BakeryList.add("cake");

        ArrayList<String> DairyList = new ArrayList<>();
        DairyList.add("milk");
        DairyList.add("cheese");
        DairyList.add("curd");

        ArrayList<String> DrinksList = new ArrayList<>();
        DrinksList.add("soda");
        DrinksList.add("coffee");
        DrinksList.add("coke");

        GroceryList.add(BakeryList);
        GroceryList.add(DairyList);
        GroceryList.add(DrinksList);

        /*
        for(String element: GroceryList){
            System.out.println(element);
        }
        */

        System.out.println(GroceryList);
        System.out.println("**************************");

        for(int i = 0 ; i < GroceryList.size() ; i++){
            System.out.println(GroceryList.get(i));
        }
    }
}
