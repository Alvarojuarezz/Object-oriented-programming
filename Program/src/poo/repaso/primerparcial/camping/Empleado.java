package poo.repaso.primerparcial.camping;

import java.util.UUID;

enum Estudios{
	SINESTUDIOS , BASICO , UNIVERSITARIO;
}

public class Empleado {
	protected String codUnico;
	protected String nombre;
	protected Estudios estudios;
	protected double sueldo;
	
	public Empleado(String nombre, Estudios estudios, double sueldo) {
		this.codUnico = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.estudios = estudios;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudios getEstudios() {
		return estudios;
	}

	public void setEstudios(Estudios estudios) {
		this.estudios = estudios;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCodUnico() {
		return codUnico;
	}
	
	@Override
	public String toString() {
		return nombre+":"+sueldo+" euros/mes.\n";
	}
	
	public double calcularSueldoTotal() {
		return sueldo*12;
	}
}
