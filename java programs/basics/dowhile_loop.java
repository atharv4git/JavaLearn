import java.util.Scanner;

public class dowhile_loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter your name , you piece of shit!!!");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("fuck off "+name);
        scanner.close();       
    }
    
}