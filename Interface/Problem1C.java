
import java.util.Scanner;

public class Problem1C implements  Problem1A,Problem1B{
    static Scanner sc=new Scanner(System.in);
    public void m1(char c){
        System.out.println(c);
    }
    public int m2(int n){
        return n;
    }
    public void m3(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Problem1C obj=new Problem1C();
        obj.m1(sc.next().charAt(0));
        obj.m2(sc.nextInt());
        obj.m3();
        System.out.println(obj.m4());
    }
}
