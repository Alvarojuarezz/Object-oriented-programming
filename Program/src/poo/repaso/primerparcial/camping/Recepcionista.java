package poo.repaso.primerparcial.camping;

public class Recepcionista extends Empleado {
	private int contratoPorHoras;

	public Recepcionista(String nombre, Estudios estudios, double sueldo, int contratoPorHoras) {
		super(nombre, estudios, sueldo);
		this.contratoPorHoras = contratoPorHoras;
	}

	public int getContratoPorHoras() {
		return contratoPorHoras;
	}

	public void setContratoPorHoras(int contratoPorHoras) {
		this.contratoPorHoras = contratoPorHoras;
	}
	
	public String toString() {
		return super.toString()+" Contrato por horas:"+contratoPorHoras;
	}
}
