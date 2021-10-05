import java.util.Scanner;

public class l_o_NOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playin a game! press q or Q to quit.");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("you're still playing game...");
        }else{
            System.out.println("Your quit the game!!!");
        }

        scanner.close();
    }
    
}
