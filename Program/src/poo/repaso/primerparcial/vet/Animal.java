package poo.repaso.primerparcial.vet;

import java.util.Date;

public class Animal {
	protected String nombre;
	protected String tipo;
	protected boolean tienePatas;
	protected int numPatas;
	protected boolean tieneAlas;
	protected boolean esPeligroso;
	protected String nombreCliente;
	protected String dniCliente;
	protected Date fechaAlta;
	protected int ident;
	protected static int contador = 0000000000;
	
	public Animal(String nombre, String tipo, boolean tienePatas, int numPatas, boolean tieneAlas, boolean esPeligroso,
			String nombreCliente, String dniCliente) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.tienePatas = tienePatas;
		this.numPatas = numPatas;
		this.tieneAlas = tieneAlas;
		this.esPeligroso = esPeligroso;
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.fechaAlta = new Date();
		this.ident = ++contador;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}

	public boolean isTienePatas() {
		return tienePatas;
	}


	public void setTienePatas(boolean tienePatas) {
		this.tienePatas = tienePatas;
	}


	public int getNumPatas() {
		return numPatas;
	}


	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}


	public boolean isTieneAlas() {
		return tieneAlas;
	}


	public void setTieneAlas(boolean tieneAlas) {
		this.tieneAlas = tieneAlas;
	}


	public boolean isEsPeligroso() {
		return esPeligroso;
	}


	public void setEsPeligroso(boolean esPeligroso) {
		this.esPeligroso = esPeligroso;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getDniCliente() {
		return dniCliente;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public int getIdent() {
		return ident;
	}

	@Override
	public String toString() {
		return "Animal con id:"+ident+":"+nombre+"("+tipo+")";
	}
	
	
	
}
