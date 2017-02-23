import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Pedir 5 números y al final mostrar
		 * si se ha introducido un 0
		 */
		
		Scanner sc = new Scanner(System.in);
		int contador=20;
		boolean encontrado=false;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número");
			int num = sc.nextInt();
			
			//VERSION 1
			/*if (num==0)
				contador=0;
				*/
			
			//VERSION 2
			if (num==0)
				encontrado=true;
			
		}
		
		//VERSION 1
		/*if(contador==0)
			System.out.println("Has introducido un 0");
		else
			System.out.println("No has introducido un 0");
			*/
		
		//VERSION 2
		if(encontrado==true)
			System.out.println("Has introducido un 0");
		else
			System.out.println("No has introducido un 0");
		
	}

}
