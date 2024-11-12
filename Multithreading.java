//S3 R2 59 Thejus

class Display extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
				System.out.println(i+" is an even number");
		}
	}
}
class Display2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			if(i%7==0)
				System.out.println("Factor of 7="+i);
		}
	}
}
class Multithreading
{
	public static void main(String args[])
	{
		try
		{
			Display d=new Display();
			Display2 p=new Display2();
			Thread t=new Thread(p);
			d.start();
			t.start();
			d.join();
			t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
