import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cifra");
		int cifra = sc.nextInt();

		if (cifra < 0 || cifra > 9999)
			System.out.println("Has introducido un valor incorrecto");
		else {
			if (cifra < 10)
				System.out.println("El valor tiene una cifra");
			else if (cifra < 100)
				System.out.println("El valor tiene dos cifras");
			else if (cifra < 1000)
				System.out.println("El valor tiene tres cifras");
			else
				System.out.println("El valor tiene cuatro cifras");
		}

	}

}
