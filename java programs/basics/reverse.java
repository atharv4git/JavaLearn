import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no: ");
        int num = sc.nextInt();
        int n1 = num;

        int reverse = 0;

        while(num !=0 ){            
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num=num/10;
            }

            System.out.println("**************************");
            System.out.println("you entered: " + n1);
            System.out.println("the reverse of " + n1 + " is " + reverse);
            System.out.println("**************************");
        
        sc.close();
    }
}
