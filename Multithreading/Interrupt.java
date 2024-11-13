
public class Interrupt extends Thread{

	@Override
	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class UseInterrupt{
	public static void main(String args[]) {
		
		Interrupt thread = new Interrupt();
		thread.start();
	}
}