package modelo;

import java.util.*;

public class Compra {

	private Cliente cliente;
	private Collection<Vehiculo> vehiculos;
	private Date fechaCompra;

	public void realizarCompra() {
		// TODO - implement Compra.realizarCompra
		throw new UnsupportedOperationException();
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	/**
	 * 
	 * @param fechaCompra
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

}