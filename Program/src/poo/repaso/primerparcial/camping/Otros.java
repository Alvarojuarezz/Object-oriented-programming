package poo.repaso.primerparcial.camping;

public class Otros extends Empleado{
	private String puesto;

	public Otros(String nombre, Estudios estudios, double sueldo, String puesto) {
		super(nombre, estudios, sueldo);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Puesto: "+puesto;
	}
}	
