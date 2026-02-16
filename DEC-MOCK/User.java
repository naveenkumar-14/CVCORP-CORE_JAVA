
import java.util.*;
class User{
	static boolean login(Gmail g,String email){
	return g.getemail().equals(email);
	}
	static boolean login(Gmail g, long mobile){
		return g.getmobile()==mobile;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Gmail g1=new Gmail(sc.next(),sc.next(),sc.next(),sc.nextLong());
		System.out.println("Object created");
		System.out.println("Login with\ne->for email \n m->mobile");
		char ch=sc.next().charAt(0);
		if(ch=='e'){
			System.out.println("Login : "+login(g1,sc.next()));
		}else{
			System.out.println("Login : "+login(g1,sc.nextLong()));
				}
		}
	}

