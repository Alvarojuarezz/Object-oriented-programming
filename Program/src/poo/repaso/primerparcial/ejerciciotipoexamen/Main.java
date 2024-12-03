package poo.repaso.primerparcial.ejerciciotipoexamen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CajaSegura cajaSegura = new CajaSegura(20);
		
		EntradaGeneral eg1 = new EntradaGeneral("General");
		EntradaNinio en1 = new EntradaNinio("Ninio");
		EntradaJubilado ej1 = new EntradaJubilado("Jubilado");
		
		cajaSegura.agregarEntrada(eg1);
		cajaSegura.agregarEntrada(ej1);
		cajaSegura.agregarEntrada(en1);
		
		cajaSegura.mostrarEntradas();
		
	}

}
