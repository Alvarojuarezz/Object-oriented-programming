package poo.repaso.primerparcial.ejerciciotipoexamen;

public class CajaSegura {
	private int contadorEntradas;
	private Entrada[] listaEntradas;
	
	public CajaSegura(int capacidad) {
		this.contadorEntradas = 0;
		this.listaEntradas = new Entrada[capacidad];
	}
	
	public void agregarEntrada(Entrada entrada) {
		if(contadorEntradas < listaEntradas.length) {
			listaEntradas[contadorEntradas] = entrada;
			contadorEntradas++;
			System.out.println("Entrada añadida.\n");
		}
	}
	
	public void mostrarEntradas() {
		for(int i = 0 ; i < contadorEntradas; i++) {
			System.out.println(listaEntradas[i]);
		}
	}
	
	
}
