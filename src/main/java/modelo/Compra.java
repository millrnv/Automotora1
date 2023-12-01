package modelo;

import java.util.*;

public class Compra {

	private Cliente cliente;
	private ArrayList<Vehiculo> vehiculos;
	private Date fechaCompra;

	public void realizarCompra() {

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