package poo.repaso.primerparcial.vet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veterinaria vete = new Veterinaria(20);
		
		Domesticos d1 = new Domesticos("Bolt", "Perro", true, 4, false, false, "Osama", "No tiene");
		Salvajes s1 = new Salvajes("Osama", "Moro",true, 2, true, true, "Alvaro", "49275680C");
		
		vete.agregarAnimal(d1);
		vete.agregarAnimal(s1);
		
		
		vete.mostrarAnimales();
		
	}

}
