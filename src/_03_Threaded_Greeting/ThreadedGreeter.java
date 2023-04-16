package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {

	int number;
	
	public ThreadedGreeter(int number) {
		this.number = number;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number:" + number);
		if(number <= 50) {
			Thread thread = new Thread(new ThreadedGreeter(number+1));
			thread.start();
			try {
				thread.join();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
