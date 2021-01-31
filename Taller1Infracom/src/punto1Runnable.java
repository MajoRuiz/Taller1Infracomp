
import java.util.Scanner;
public class punto1Runnable implements Runnable {
	

	

		private boolean esPar;
		
		private String punto1;
		
		private static int cont;

		private static int time;
		public punto1Runnable(boolean esPar, String punto1) {
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
				Thread t1 = new Thread (new punto1Runnable (true, "t1") );
				Thread t2 = new Thread (new punto1Runnable (false, "t2") );
				
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
					System.out.println(punto1+"  "+i);
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

