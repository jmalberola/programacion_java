import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//PEDIR NÚMEROS HASTA QUE USUARIO INTRODUZCA UN 0
		//IMPRIMIR EL DEL MEDIO
		//MOSTRARLOS AL REVES
		
		int[] array = new int[1000];
		
		Scanner sc = new Scanner(System.in);
		
		int posicion=0;
		int numero=1000;
		do{
			System.out.println("Introduce un número");
			array[posicion] = sc.nextInt(); 
			posicion++;
		}while(array[posicion-1]!=0);
		
		/*en posicion-1 tengo el índice del último número introducido.
		  Como tenemos números desde la posición 0 hasta posicion-1, 
		  tenemos un total de "posicion" números, y esto es el num del medio*/
		int medio=posicion/2;
		
		//recorremos desde el último número hasta el número de la posicion 0
		for(int j=posicion-1;j>=0;j++)
			System.out.println(array[j]);
		
		
	}

}
