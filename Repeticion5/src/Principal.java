import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el n�mero a adivinar");
		int num = sc.nextInt();
		int num2;
		
		System.out.println("Empezamos a jugar");
		do{
			System.out.println("Introduce un n�mero");
			num2 = sc.nextInt();
			
			if(num==num2){
				System.out.println("Qu� m�quina! Lo has adivinado");
			}
			
			if(num>num2){
					System.out.println("El n�mero secreto es menor");
			}
			
			if(num<num2){
					System.out.println("El n�mero secreto es mayor");					
			}
			
		}while(num!=num2);
		
		
		

	}

}
