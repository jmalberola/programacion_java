import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//PREGUNTE NÚMEROS del 0 al 9
		//MUESTRE CUANTOS 0's, 1's, 2's... 9's ha introducido el usuario
		//TERMINE CUANDO INTRODUZCA UN NÚMERO QUE NO SEA DEL 0-9
		
		int[] array = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		int posicion=0;
		int numero=0;
		do{
			System.out.println("Introduce un número");
			posicion = sc.nextInt(); 
			if(numero>=0 && numero<=9)
				array[posicion]++;
		}while(numero>=0 && numero<=9);
		
		for(int j=0;j<10;j++)
			System.out.println(array[j]);
		
	}

}
