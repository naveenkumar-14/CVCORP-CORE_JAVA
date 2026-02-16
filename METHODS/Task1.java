import java.util.Scanner;

public class Task1 {
    static int a;
    static int b;
    static int m1(){
        if(a==0 && b==0){
            return 3;
        }
        else if((a*b)%2==0){
            return 1;
        }else {
            return 2;
        }
    }
    static String m2(){
        return m1()==1?"one":m1()==2?"two":m1()==3?"three":"";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(m2());
    }
}
