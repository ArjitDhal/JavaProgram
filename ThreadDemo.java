public class Demo extends Thread
{
	static Demo dd;
	public static void main(String args[])
	{
		dd=new Demo();//It is Demo object.//It is a Thread class object
		System.out.println("Thread is Alive: "+dd.isAlive());
		dd.start();//Thread got life
		System.out.println("Thread is Alive: "+dd.isAlive());//true
	}
	@Override
	public void run()
	{
		System.out.println("Thread is Running.");
		dd.stop();//I explicitly kill the Thread
		System.out.println("Bye");
	}
}
//run() method is implicitly called by Thread Schedular.
