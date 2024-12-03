package poo.repaso.primerparcial.ejerciciotipoexamen;

import java.util.Date;
import java.util.UUID;

public class Entrada {
	protected Date fechaEntrada;
	protected String categoria;
	protected double precioBase = 25.65;
	protected String codUnico;
	
	public Entrada(String categoria) {
		this.fechaEntrada = new Date();
		this.categoria = categoria;
		this.codUnico = UUID.randomUUID().toString();
	}
	
	public double calculoPrecio() {
		return precioBase;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getCodUnico() {
		return codUnico;
	}

	@Override
	public String toString() {
		return "FechaEntrada=" + fechaEntrada + ", categoria=" + categoria;
	}	
}
