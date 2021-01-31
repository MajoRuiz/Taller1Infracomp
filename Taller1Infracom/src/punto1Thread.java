import java.util.Scanner;

public class punto1Thread extends Thread {

	private boolean esPar;
	
	private String punto1;
	
	private static int cont;

	private static int time;
	public punto1Thread(boolean esPar, String punto1) {
		super();
		this.esPar = esPar;
		this.punto1 = punto1;
	}
	
	public static void main (String[] args)
	{
		try {
			Scanner input = new Scanner (System.in);
			System.out.println("Tiempo");
			time = input.nextInt();
			System.out.println("contador");
			cont = input.nextInt();
			punto1Thread t1 = new punto1Thread (true ,"Thread 1");
			punto1Thread t2 = new punto1Thread (false ,"Thread 2");
			
			t1.start();
			t2.start();
			
		 Thread.sleep(time);
			
		}
		
		catch (Exception e) {
			
		}
	}
	
	public void run () {
		try {
		for (int i =0;i <= cont;i++)  {
			if (esPar==true) {
				System.out.println(punto1+" "+i);
				Thread.sleep(time);
				
				this.esPar=false;
			}
			else {
				this.esPar=true;
				
			}
			
		}
		}
		catch (Exception e){
			
		}
	}
	
	
	
	
	
}
