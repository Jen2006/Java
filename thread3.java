package koi;

class mythread extends Thread{
	private volatile boolean suspended=false;
	private volatile boolean stopped=false;
	
	public void run()
	{
		synchronized(this)
		{
			while(!stopped) 
			{
				try {
					while(suspended)
					{
						wait();
					}
					System.out.println(Thread.currentThread().getName()+"is running...");
					Thread.sleep(1000);
				}
				catch (InterruptedException e) 
				{
							System.out.println(Thread.currentThread().getName()+"interrupted.");
				}
			}
			System.out.println(Thread.currentThread().getName()+"Stopped.");
		}
	}
	public void suspendThread()
			{
				suspended=true;
			}
			public synchronized void resumeThread() {
				suspended = false;
				notify();
			}
			public void stopThread() {
				stopped = true;
			}
		}
public class thread3 
{
	public static void main(String[]args)
			{
				mythread t1=new mythread();
				t1.start();
				try {
					Thread.sleep(3000);
					
					System.out.println("Suspending thread...");
					t1.suspendThread();
					Thread.sleep(3000);
					
					System.out.println("Resuming Thread..");
					t1.resumeThread();
					Thread.sleep(3000);
					System.out.println("Stopping thread...");
					t1.stopThread();
					
				}catch (InterruptedException e) {
					System.out.println(e);
				}
				
		 
			}
			
		}
