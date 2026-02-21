class BMS
{
	int seats = 20;
	synchronized void book(int seats)
	{
		if(this.seats >= seats)
		{
			System.out.println("Seats Booked to "+Thread.currentThread().getName());
			this.seats = this.seats - seats;
		}
		else{
			System.out.println("Pora Bayataki.... "+Thread.currentThread().getName());
		}
		System.out.println("Available seats : "+this.seats);
	}
}
class Ramana extends Thread
{
	static BMS obj;
	Ramana(BMS obj)
	{
		this.obj = obj;
	}
	public void run()	
	{
		obj.book( 4 );
	}
}
class Rachith implements Runnable
{
	static BMS obj;
	Rachith(BMS obj)
	{
		this.obj = obj;
	}
	public void run()	
	{
		obj.book( 18 );
	}
}
class Test
{
	
	public static void main(String[] args)
	{
		BMS obj = new BMS();
		Ramana t1 = new Ramana( obj );
		Rachith rach = new Rachith( obj );
		Thread t2 = new Thread( rach );
		t1.setPriority(10);
		t2.setPriority(1);
		t1.setName("Pagodu");
		t2.setName("Manodu");
		
		t2.start();
		t1.start();
	}
}