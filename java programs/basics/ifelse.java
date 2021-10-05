import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

         if(age>=75){
             System.out.println("OK boomer!!!");
         }
         else if(age>=18){
             System.out.println("you can vote!!!");
         }
         else{
             System.out.println("can't vote kid!!!");
         }
         scanner.close();
    }
    
}
