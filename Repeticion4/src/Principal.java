import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que se introduzca uno negativo y mostrar la media
		 */

		Scanner sc = new Scanner(System.in);
		int suma = 0, num = 0;
		int contador = 0;

		while (num >= 0) {
			System.out.println("Introduce un número");
			num = sc.nextInt();
			if (num > 0) {
				suma = suma + num;
				contador++;
			}
		}

	}

}
