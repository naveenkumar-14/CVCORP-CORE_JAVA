import java.util.*;
interface Movie{
	String mname="RRR";
	int price=250;
	
}


abstract class Theatre{
	private String mname;
	private int price;
	Theatre(String mname,int price){
		this.mname=mname;
		this.price=price;
		
	}
	Theatre(){
	}
	public String getMname(){
		return this.mname;
	}
		public int getPrice(){
	return this.price;
	}
	abstract void display(Theatre t);
}

