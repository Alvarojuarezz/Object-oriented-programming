package poo.repaso.primerparcial.ejerciciotipoexamen;

public class EntradaJubilado extends Entrada{

	public EntradaJubilado(String categoria) {
		super(categoria);
	}

	public double calcularPrecio() {
		return super.calculoPrecio()*0.3;
	}
	
	public String toString() {
		return super.toString()+" El precio de la entrada de jubilado es"+this.calcularPrecio()+" euros.\n";
	}
}
