import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = sc.nextInt();
		System.out.println("Introduce el tercer numero");
		int n3 = sc.nextInt();
		int mayor, medio, menor;

		if(n1<n2){
			if(n1<n3){
				menor=n1;
				if(n2<n3){
					mayor=n3;
					medio=n2;
				}
				else{
					mayor=n2;
					medio=n3;
				}
			}
			else{/*n1 no es < n3*/
				menor=n3;
				mayor=n2;
				medio=n1;
			}
		}
		else{/*n1 > n2*/
			if(n1>n3){
				mayor=n1;	
				if(n2>n3){
					menor=n3;
					medio=n2;
				}
				else{
					menor=n2;
					medio=n3;
				}
			}
			else{/*n1 < n3*/
				mayor=n3;
				menor=n2;
				medio=n1;
			}
			
		}
		
		System.out.println("El orden es "+menor+" "+medio+" "+mayor);
			
			

	}

}
