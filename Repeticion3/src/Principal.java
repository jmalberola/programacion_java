import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Pedir n�meros hasta que se introduzca un n�mero negativo y mostrar la
		 * suma total
		 */

		/*
		 * VERSI�N 1 Scanner sc = new Scanner(System.in); 
		 * int suma=0,num=0;
		 * 
		 * while(num>=0){ 
		 * System.out.println("Introduce un n�mero"); 
		 * num = sc.nextInt(); 
		 * suma = suma + num; 
		 * }
		 */

		// VERSI�N 2
		/*
		 * Scanner sc = new Scanner(System.in); int suma=0,num=0;
		 * 
		 * do { 
		 * System.out.println("Introduce un n�mero"); 
		 * num = sc.nextInt();
		 * suma = suma + num; 
		 * } while (num>=0);
		 * 
		 * suma=suma-num; 
		 * System.out.println("La suma total es "+suma);
		 */

		// VERSI�N 3
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * int suma=0,num=0;
		 * 
		 * do { 
		 * System.out.println("Introduce un n�mero"); 
		 * num = sc.nextInt();
		 * if(num>=0) 
		 * suma = suma + num; 
		 * } while (num>=0);
		 * 
		 * System.out.println("La suma total es "+suma);
		 */

		// VERSI�N 4
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * int suma=0,num=0;
		 * 
		 * do { 
		 * suma = suma + num; 
		 * System.out.println("Introduce un n�mero");
		 * num = sc.nextInt(); 
		 * } 
		 * while (num>=0);
		 * 
		 * System.out.println("La suma total es "+suma);
		 */

		//VERSI�N 5
		Scanner sc = new Scanner(System.in);
		int suma = 0;

		for (int i = 0; i >= 0; i++) {
			System.out.println("Introduce un n�mero");
			i = sc.nextInt();
			if (i >= 0)
				suma = suma + i;
			else // el n�mero es negativo
				break;
		}

	}

}
