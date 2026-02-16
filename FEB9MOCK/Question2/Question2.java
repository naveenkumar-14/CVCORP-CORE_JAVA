
import java.util.*;
class Main {

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		A obj1=new A(){
			public int sum(int a,int b){
				return a+b;
			}
		};
		A.I obj2=(s)->{
			return s+""+s;
		};
		System.out.println(obj2.m1("Hello"));
		System.out.println(A.I.m2(5,5));
		System.out.println(obj1.sum(3, 4));
		
	}
}

abstract class A{
	public void displayHello(){
	System.out.println("Hello");
	}
	abstract int sum(int a,int b);
	interface I{
		String  m1(String s);
		static int m2(int a,int b){
			return a+b;
		}
	}
}
