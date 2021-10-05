import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name:");
        String name = scanner.nextLine();
        System.out.println("What is your age:");
        int age = scanner.nextInt();
        scanner.nextLine();//to clear the \n
        System.out.println("what is your favourite fruit:");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        System.out.println("your favourite fruit is: "+food);

        scanner.close();
    }   
}
