import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número a adivinar");
		int num = sc.nextInt();
		int num2;
		
		System.out.println("Empezamos a jugar");
		do{
			System.out.println("Introduce un número");
			num2 = sc.nextInt();
			
			if(num==num2){
				System.out.println("Qué máquina! Lo has adivinado");
			}
			
			if(num>num2){
					System.out.println("El número secreto es menor");
			}
			
			if(num<num2){
					System.out.println("El número secreto es mayor");					
			}
			
		}while(num!=num2);
		
		
		

	}

}
