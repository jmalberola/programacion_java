
public class Utilidades {
	
	public void compararSueldos(float s1, float s2){
		
		if(s1>s2)
			System.out.println("El primer sueldo es mayor");
		else
			if(s2>s1)
				System.out.println("El segundo sueldo es mayor");
			else 
				System.out.println("Los dos sueldos son iguales");
	}
	
	public float diferenciaSueldos(float s1, float s2){
		
		if(s1>s2)
			return s1-s2;
		else
			if(s2>s1)
				return s2-s1;
			else 
				return 0;		
	}

}
