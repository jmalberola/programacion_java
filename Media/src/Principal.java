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
		
		//Comprobación que las notas están entre 0 y 10
		
		if((acumulado/3)>=5)
			System.out.println("Estás aprobado");
		else
			System.out.println("Estás suspendido");

	}

}
