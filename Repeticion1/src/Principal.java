import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		//int num = sc.nextInt();
		
	
		//VERSI�N 1
		/*for(int i=0; i<100; i=i+7){
			System.out.println(i);
		}*/
		
		//VERSI�N 2
		/*for(int i=0; i<100; i++){		
			System.out.println(i);
			i=i+6;
		}*/
		
		//VERSI�N 3
		/*for(int i=1; i<100; i++){		
			System.out.println(i=i+6);
		}*/
		
		//VERSI�N 4
		/*for(int i=1; i<100; i++){
			if(i%7==0)
				System.out.println(i);
		}*/
		
		//VERSI�N 5
		/*int i=0;
		while(i<100){
			System.out.println(i);
			i+=7;// es lo mismo que i=i+7;
		}*/
		
		//VERSI�N DE 100 A 0 (1)
		/*for(int i=100; i>0; i=i-7){
			System.out.println(i);
		}*/
		
		//VERSI�N DE 100 A 0 (2)
		/*int i=100;
		while(i>0){
			System.out.println(i);
			i-=7;// es lo mismo que i=i-7;
		}*/
		
	}

}
