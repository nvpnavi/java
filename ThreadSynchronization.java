//S3 R2 59 Thejus

class Multiply
{
	public void display(int n)
	{
		for(int i=1;i<=n;i++)
			System.out.println(n+"*"+i+"="+(n*i));
	}
}
class MyClass1 extends Thread
{
	private Multiply t;
	public MyClass1(Multiply t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(6);
	}
}
class MyClass2 extends Thread
{
	private Multiply t;
	public MyClass2(Multiply t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(12);
	}
}
class ThreadSynchronization
{
	public static void main(String args[])
	{
		Multiply o=new Multiply();
		MyClass1 m=new MyClass1(o);
		MyClass2 n=new MyClass2(o);
		m.start();
		n.start();
	}
}
