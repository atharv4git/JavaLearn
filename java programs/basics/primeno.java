import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6n-1 , 6n+1
        System.out.println("enter a no: ");
        int n = scanner.nextInt();

        double prime1 =(6*n-1);
        double prime2 = (6*n+2);
        
        System.out.println("the prime nos are: " + prime1 + " and " + prime2);

        scanner.close();

    }
}
