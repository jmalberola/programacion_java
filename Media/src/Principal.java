import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int acumulado=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota = sc.nextInt();
		acumulado=acumulado+nota;
		System.out.println("Introduce otra nota");
		nota = sc.nextInt();
		System.out.println("Introduce otra nota");
		nota = sc.nextInt();
		
		//Comprobaci�n que las notas est�n entre 0 y 10
		
		if((acumulado/3)>=5)
			System.out.println("Est�s aprobado");
		else
			System.out.println("Est�s suspendido");

	}

}
