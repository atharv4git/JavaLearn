import java.util.Scanner;
class Fourth_prime{
    static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no");
    int n= sc.nextInt();
    int f=0;
    if(n==0 || n==1)
    System.out.println("Entered no is not prime" );
    else{
    for(int i=2; i<=n/2;i++){
    
    if(n%i==0)
    {
    System.out.println("Entered no is not prime" );
    f=1; break;
    }}}
    if(f==0){
    System.out.println("Entered no is prime" );
    }}

}