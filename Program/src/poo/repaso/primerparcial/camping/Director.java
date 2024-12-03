package poo.repaso.primerparcial.camping;

public class Director extends Empleado {
	private boolean esDuenio;

	public Director(String nombre, Estudios estudios, double sueldo, boolean esDuenio) {
		super(nombre, estudios, sueldo);
		this.esDuenio = esDuenio;
	}

	public boolean isEsDuenio() {
		return esDuenio;
	}

	public void setEsDuenio(boolean esDuenio) {
		this.esDuenio = esDuenio;
	}
	
	public String toString() {
		String duenio = esDuenio ? "Sí" : "No";
		return super.toString()+" ¿Es dueño?"+duenio;
	}
}
