import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empleado e1 = new Empleado();
						
		//Introducimos datos de empleado 1
		e1.setEdad(25);				
		e1.setSueldo(1000);
		System.out.println("Introduce una calle");
		String c = sc.nextLine();
		System.out.println("Introduce un numero");
		int n = sc.nextInt();
		
		Direccion d = new Direccion();
		d.setCalle(c);
		d.setNumero(n);
		
		e1.setDireccion(d);
		
		
		Empleado e2 = new Empleado();
		e2.setSueldo(1000);
		
		System.out.println("Introduce un aumento");
		float aumento = sc.nextFloat();
		
		System.out.println("El sueldo antes del incremento es "+e1.getSueldo());
		e1.incrementar_sueldo(aumento);
		System.out.println("El sueldo después del incremento es "+e1.getSueldo());
					
		Utilidades u = new Utilidades();
		
		u.compararSueldos(e1.getSueldo(), e2.getSueldo());
		float dif=u.diferenciaSueldos(e1.getSueldo(), e2.getSueldo());
		System.out.println("La diferencia de sueldos es "+dif);

	}

}
