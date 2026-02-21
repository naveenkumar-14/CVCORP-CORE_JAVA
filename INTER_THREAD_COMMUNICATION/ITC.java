class Batch_243
{
	synchronized void core_java() throws InterruptedException
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			wait();
			notify();
		}
	}
	synchronized void programming()throws InterruptedException
	{
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
			notify();
			wait();
		}

	}
}
class Spk extends Thread
{
	static Batch_243 obj;
	Spk(Batch_243 obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		try{
		obj.core_java();
		}	
		catch(Exception e)
		{
			System.out.println("Hello");
		}
	}
}
class Santhosh_Sir implements Runnable
{
	Batch_243 obj;
	Santhosh_Sir(Batch_243 obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		try{
			obj.programming();
		}	
		catch(Exception e)
		{
			System.out.println("Hello");
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		Batch_243 obj = new Batch_243();
		Spk t1 = new Spk( obj );
		Thread t2 = new Thread( new Santhosh_Sir( obj ) );
		t1.start();
		t2.start();

	}
}