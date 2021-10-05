//package oop_series;

public class try1 {
    String name;
    int age;
    
    void get(String N, int A){
        name = N;
        age = A;
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[])

    {
        try1 s1 = new try1();
        s1.get("chimtu",20);
        s1.print();
        try1 s2 = new try1();
        s2.get("chintu",19);
        s2.print();
    }    
    
}
