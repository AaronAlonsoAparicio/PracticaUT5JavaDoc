package clase;

/**
 * Clase que representa a un alumno en una clase.
 */
public class Alumno extends IntegrantesClase {
    private final int numeroAsignaturas = 4; // Número fijo de asignaturas para un alumno

    /**
     * Constructor de la clase Alumno.
     * @param dni El DNI del alumno.
     * @param nombre El nombre del alumno.
     * @param edad La edad del alumno.
     * @param numeroAsignaturas El número de asignaturas del alumno.
     */
    public Alumno(String dni, String nombre, int edad, int numeroAsignaturas) {
        super(dni, nombre, edad);
    }

    /**
     * Método toString para mostrar las caracteristicas de cada usuario.
     * @return Representación en cadena del objeto Alumno.
     */
    @Override
    public String toString() {
        return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notaMediaCurso="
                + ", numeroAsignaturas=" + numeroAsignaturas + "]";
    }
    
    
    
    
    
    
    
    
    

    /**
     * Método para imprimir la información del alumno.
     */
    @Override
    public void imprimirInformacion() {
        System.out.println(toString());
    }

    /**
     * Método para obtener el número de asignaturas del alumno.
     * @return El número de asignaturas del alumno.
     */
    public int getNumeroAsignaturas() {
        return numeroAsignaturas;
    }
	
	/**
	 * 
	 * @param suma
	 * @return double la nota media de cada alumno.
	 */
	
	public double calcularNotaMedia() {
		double suma;
		suma = notasAsigatura.NOTA_BASE_DE_DATOS + notasAsigatura.NOTA_LENGUAJE_DE_MARCAS 
				+ notasAsigatura.NOTA_PROGRAMACION + notasAsigatura.NOTA_SISTEMAS;
		
		double notaMedia = suma / this.numeroAsignaturas;
		return notaMedia;
	}


	/**
     * Método para comprobar la validez de un DNI.
     * @return true si el DNI es válido, false si no lo es.
     */
	
	public boolean comprobarDni() {
		//51346081B
		int contador = 0;
		//Verificar los 8 primero digitos del DNI.
		while(contador < 8 ) {
			if(!Character.isDigit(this.dni.charAt(contador))) {
				System.out.println("Este DNI no es valido");
					return false;
			}
			contador++;
			
		}
		
		//Verificar el ultimo caracter.
		while(contador >= 9 && contador < 10 ) {
			if (!Character.isLetter(this.dni.charAt(contador))) {
				System.out.println("Este DNI no es valido");
				return false;
				
			}else {
				System.out.println("DNI valido.");
				
			}
			contador++;
			
		}
		
		return true;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	

}
