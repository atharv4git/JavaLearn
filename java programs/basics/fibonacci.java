import java.util.Scanner;

public class fibonacci {
    static int fs(int i)
    {
    if (i <= 1)
       return i;
    return fs(i-1) + fs(i-2);
    }
      
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = scanner.nextInt();
        for(int i = 0 ; i <= n ; i++){
            System.out.println(fs(n));
        }
        scanner.close();
    }
 

}
