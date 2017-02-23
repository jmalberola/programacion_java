import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir 5 números y mostrar la suma total

		Scanner sc = new Scanner(System.in);
		int num;

		int acumulado=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un número");
			num = sc.nextInt();
			acumulado = acumulado + num;
		}
		System.out.println("La suma total es "+acumulado);

	}

}
