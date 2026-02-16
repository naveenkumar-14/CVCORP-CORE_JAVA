
import java.util.Scanner;

class Question1{
    static void m1(int a,int b){
    try{
        System.out.println(a/b);
    }catch(ArithmeticException e){
        System.out.print(e);            
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        m1(sc.nextInt(),sc.nextInt());
    }
}