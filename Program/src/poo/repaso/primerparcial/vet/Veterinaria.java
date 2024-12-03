package poo.repaso.primerparcial.vet;

public class Veterinaria {
	
	private int contadorAnimales;
	private Animal[] listaAnimales;
	public Veterinaria(int capacidad) {
		super();
		this.contadorAnimales = 0;
		this.listaAnimales = new Animal[capacidad];
	}
	
	public void agregarAnimal(Animal a) {
		if (contadorAnimales < listaAnimales.length) {
			listaAnimales[contadorAnimales] = a;
			contadorAnimales++;
			System.out.println("Animal añadido.\n");
		}
	}
	
	public void mostrarAnimales() {
		for(int i = 0; i < contadorAnimales; i++) {
			System.out.println(listaAnimales[i]);
		}
	}	
}
