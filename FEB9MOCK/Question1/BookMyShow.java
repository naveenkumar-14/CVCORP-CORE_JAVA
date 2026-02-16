import java.util.*;
import java.lang.*;
class BookMyShow extends Theatre implements Movie{
	public void display(Theatre t){
		System.out.println(t.getMname()+"--->"+t.getPrice());
	}
	public BookMyShow(String name,int price){
		super(name,price);
	}
	public BookMyShow(){
	
	}
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Theatre t=new BookMyShow(sc.next(),sc.nextInt());
		
		
		Movie movie=new BookMyShow();
		try{
		
			if(movie.mname.equals(t.getMname()) && movie.price==t.getPrice()){
				System.out.println("Ticket Booked Successfully");
				t.display(t);
			}else{
			throw new InvalidDetailsException();
			}

		}catch(InvalidDetailsException e){
			e.printStackTrace();
		}
				
		
	}
	
}
