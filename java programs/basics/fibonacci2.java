import java.util.Scanner;
class Fifth_fibonacci{
    static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no upto which series should display");
    int n= sc.nextInt();
    int a=0, b=1,c;
    System.out.println(" series upto "+ n+" term "+ a+ " "+ b);
    for(int i=0; i<n-2;i++){
    c= a+b;
    System.out.println(c);
    a=b;
    b=c;}
    }}