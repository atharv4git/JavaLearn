import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a no. btw 1 and 10: ");
        int a = scanner.nextInt();

        switch(a){
            case 1: System.out.println("enter your favourite food: ");
                    String favFood = scanner.nextLine();
                    System.out.println("enter your favourite topping: ");
                    String favTopping = scanner.nextLine();
                    break;

            case 2: System.out.println("enter your favourite dress name: ");    
                    String favDress = scanner.nextLine();
                    System.out.println("enter your favourite colour: ");
                    String favColour = scanner.nextLine();
                    break;
                    
            case 3: System.out.println("enter your favourite Country name: ");    
                    String favCountry = scanner.nextLine();
                    System.out.println("enter your favourite place in that country: ");
                    String favPlace = scanner.nextLine();
                    break;       
                    
            
        }

        scanner.close();

    }
}
