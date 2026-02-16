import java.util.*;
class Question3_1 extends Question3{
	public int calculate(int a,int b){
		return a*b;
	}
	public Question3_1(int a,int b){
		super(a,b);
	}
	Question3_1(){

	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Question3 obj1=new Question3_1(a,b);
		System.out.println(obj1.calculate(a,b));
		Question3_1 obj2=new Question3_1();
		System.out.println(obj2.calculate(a,b));

	}
}