
public class Empleado {
	
	private String nombre;
	private String dni;
	private int edad;
	private Direccion direccion;
	private PuestoTrabajo puesto_trabajo;
	
	public Empleado(){
		
	}
	
	public Empleado(String n){
		nombre=n;
	}
	

	public PuestoTrabajo getPuesto_trabajo() {
		return puesto_trabajo;
	}

	public void setPuesto_trabajo(PuestoTrabajo puesto_trabajo) {
		this.puesto_trabajo = puesto_trabajo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void incrementar_sueldo(float a){
		puesto_trabajo.setSueldo(puesto_trabajo.getSueldo()+a);
	}

}
