import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empleado e1 = new Empleado();
						
		//Introducimos datos de empleado 1 forma 1
		introducir_datos(e1);
				
		//Introducimos datos de empleado 1 forma 2
		//e1 = introducir_datos();
		
		System.out.println(e1.getNombre()+" "+e1.getDni()+" "+e1.getEdad()+" "+e1.getPuesto_trabajo().getSueldo());
		
		//Introducir direccion
		System.out.println("Introduce una calle");
		String c = sc.nextLine();
		System.out.println("Introduce un numero");
		int n = sc.nextInt();
		
		Direccion d = new Direccion();
		d.setCalle(c);
		d.setNumero(n);
		
		e1.setDireccion(d);
		
		
		/*Empleado e2 = new Empleado();
		e2.setSueldo(1000);
		
		System.out.println("Introduce un aumento");
		float aumento = sc.nextFloat();
		
		System.out.println("El sueldo antes del incremento es "+e1.getSueldo());
		e1.incrementar_sueldo(aumento);
		System.out.println("El sueldo despu�s del incremento es "+e1.getSueldo());
					
		Utilidades u = new Utilidades();
		
		u.compararSueldos(e1.getSueldo(), e2.getSueldo());
		float dif=u.diferenciaSueldos(e1.getSueldo(), e2.getSueldo());
		System.out.println("La diferencia de sueldos es "+dif);*/

	}
	
	//FORMA 1
	public static void introducir_datos(Empleado e){
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Introduce un nombre");
		String n = sc.nextLine();
		e.setNombre(n);
		System.out.println("Introduce un dni");
		String dni = sc.nextLine();
		e.setDni(dni);		
		System.out.println("Introduce una edad");
		int edad = sc.nextInt();
		e.setEdad(edad);
		System.out.println("Introduce un sueldo");
		float s = sc.nextInt();
		
		PuestoTrabajo pt = new PuestoTrabajo();		
		pt.setSueldo(s);
		e.setPuesto_trabajo(pt);
		
	}
	
	//FORMA 2
	public static Empleado introducir_datos(){
		
		Scanner sc = new Scanner(System.in);
		
		Empleado e = new Empleado();
		
		
		System.out.println("Introduce un nombre");
		String n = sc.nextLine();
		e.setNombre(n);
		System.out.println("Introduce un dni");
		String dni = sc.nextLine();
		e.setDni(dni);		
		System.out.println("Introduce una edad");
		int edad = sc.nextInt();
		e.setEdad(edad);
		System.out.println("Introduce un sueldo");
		float s = sc.nextInt();
		
		PuestoTrabajo pt = new PuestoTrabajo();		
		pt.setSueldo(s);
		e.setPuesto_trabajo(pt);
		
		return e;
		
		
	}

}
