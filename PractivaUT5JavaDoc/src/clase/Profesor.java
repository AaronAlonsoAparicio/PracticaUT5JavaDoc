package clase;

import java.util.ArrayList;

public class Profesor extends IntegrantesClase {
	private double sueldo;
	private ArrayList<Alumno> alumnos;
	
	
	
	
	public Profesor(String dni, String nombre, int edad, double sueldo, ArrayList<Alumno> alumnos) {
		super(dni, nombre, edad);
		this.sueldo = sueldo;
		this.alumnos = new ArrayList<>();
	
	}



	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", alumnos="
				+ alumnos + "]";
	}



	@Override
	public void imprimirInformacion() {
		System.out.println(toString());
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
	
	
	public double calcularNotaMediaAlumnos() {
		double mediaAlumnos = 0;
		double resultadoMedia = 0;
		for (Alumno alumno : alumnos) {
			mediaAlumnos += alumno.calcularNotaMedia();
			resultadoMedia = mediaAlumnos / alumnos.size();
		}
		return resultadoMedia;
		
		
	}
	
	
	public boolean anyadirAlumnos() {
		Alumno nuevoAlumno = new Alumno("51246081B","Aaron",24, 4);
		for (Alumno alumno : alumnos) {
			if (alumnos.contains(nuevoAlumno)){
				System.out.println("Este alumnos ya esta en clase.");
				return false;
				
				
			}
			else {
				System.out.println("Nuevo alumno en clase.");
				alumnos.add(nuevoAlumno);
				
			}
			
			
		}
		return true;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
