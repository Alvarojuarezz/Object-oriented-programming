package poo.repaso.primerparcial.ejerciciotipoexamen;

public class EntradaGeneral extends Entrada{

	public EntradaGeneral(String categoria) {
		super(categoria);
	}
	
	public double calcularPrecio() {
		return super.calculoPrecio();
	}

	@Override
	public String toString() {
		return super.toString()+" El precio para la entrada general es "+this.calcularPrecio()+" euros.\n";
	}	
}
