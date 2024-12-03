package poo.repaso.primerparcial.ejerciciotipoexamen;

public class EntradaNinio extends Entrada{

	public EntradaNinio(String categoria) {
		super(categoria);
	}
	
	public double calcularPrecio() {
		return super.calculoPrecio()*0.5;
	}
	@Override
	public String toString() {
		return super.toString()+" El precio de la  entrada de niño es "+this.calcularPrecio()+" euros.\n";
	}
}
