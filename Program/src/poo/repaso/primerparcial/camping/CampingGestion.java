package poo.repaso.primerparcial.camping;

public class CampingGestion {
	private int contadorEmpleados;
	private Empleado[] listaEmpleados;
	
	public CampingGestion(int capacidad) {
		this.contadorEmpleados = 0;
		this.listaEmpleados = new Empleado[capacidad];
	}
	
	public void agregarEmpleado(Empleado e) {
		if(contadorEmpleados < listaEmpleados.length) {
			listaEmpleados[contadorEmpleados] = e;
			contadorEmpleados++;
			System.out.println("Empleado agregado.\n");
		}
	}
	
	public void mostrarEmpleados() {
		for(int i = 0; i < contadorEmpleados; i++) {
			System.out.println(listaEmpleados[i]);
		}
	}
	
	
}
