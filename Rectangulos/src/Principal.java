import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Pedir 3 lados y calcular A y P de los 3 rectángulos que se forman
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer lado");
		int lado1 = sc.nextInt();
		System.out.println("Introduce el segundo lado");
		int lado2 = sc.nextInt();
		System.out.println("Introduce el tercer lado");
		int lado3 = sc.nextInt();			
		
		//calcular(lado1,lado2);
		//calcular(lado1,lado3);
		//calcular(lado2,lado3);
		//calcular_area_y_perimetro(lado1,lado2);
		int a=calcular_area(lado1,lado2);
		System.out.println("El área es: "+a);

	}
	
	public static void calcular(int x, int y){
		
		int area = x * y;
		int perimetro = x*2 + y*2;
		System.out.println("El área y perímetro del 1 son: "+area+" y "+perimetro);
				
	}
	
	public static int calcular_area(int x, int y){
		int area = x * y;
		return area;		
	}

	public static void calcular_perimetro(int x, int y){
		int perimetro = x*2 + y*2;
		System.out.println("El perimetro es: "+perimetro);
	}
	
	public static void calcular_area_y_perimetro(int x, int y){
		int area = x * y;
		System.out.println("El área es: "+area);
		calcular_perimetro(x,y);
	}
	
}










