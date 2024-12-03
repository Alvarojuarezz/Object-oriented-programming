package poo.repaso.primerparcial.vet;

public class Salvajes extends Animal {

	public Salvajes(String nombre, String tipo, boolean tienePatas, int numPatas, boolean tieneAlas,
			boolean esPeligroso, String nombreCliente, String dniCliente) {
		super(nombre, tipo, tienePatas, numPatas, tieneAlas, esPeligroso, nombreCliente, dniCliente);
	}
	
	public String toString() {
		return super.toString();
	}
}
