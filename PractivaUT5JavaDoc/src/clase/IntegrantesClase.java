package clase;

import java.util.Objects;

public abstract class IntegrantesClase {
	protected final String dni;
	protected final String nombre;
	protected int edad;
	
	
	
	public IntegrantesClase(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		
		comprobarDni();
			
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getDni() {
		return dni;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegrantesClase other = (IntegrantesClase) obj;
		return Objects.equals(dni, other.dni);
	}



	@Override
	public String toString() {
		return "IntegrantesClase [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public abstract void imprimirInformacion();
	
	public abstract boolean comprobarDni();
	

}

