import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int nota = sc.nextInt();

		if (nota < 0 || nota > 10) {
			System.out.println("error. introduce una nota valida");
		} else {

			if (nota <= 4)
				System.out.println("suspendido");

			if (nota == 5)
				System.out.println("suficiente");

			if (nota == 6)
				System.out.println("bien");

			if (nota == 7 || nota == 8)
				System.out.println("notable");

			if (nota == 9)
				System.out.println("sobresaliente");

		}
	}

}
