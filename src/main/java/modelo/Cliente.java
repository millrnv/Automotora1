package modelo;

import java.util.*;

public class Cliente {

	private Automotora automotora;
	private Collection<Compra> compras;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contraseña;

	/**
	 * 
	 * @param marca
	 */
	public Vehiculo buscarVehiculoMarca(String marca) {
		// TODO - implement Cliente.buscarVehiculoMarca
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param modelo
	 */
	public Vehiculo buscarVehiculoModelo(String modelo) {
		// TODO - implement Cliente.buscarVehiculoModelo
		throw new UnsupportedOperationException();
	}

	public Vehiculo buscarVehiculoTipo() {
		// TODO - implement Cliente.buscarVehiculoTipo
		throw new UnsupportedOperationException();
	}

	public void agregarVehiculosAlCarrito() {
		// TODO - implement Cliente.agregarVehiculosAlCarrito
		throw new UnsupportedOperationException();
	}

	public double verSubtotal() {
		// TODO - implement Cliente.verSubtotal
		throw new UnsupportedOperationException();
	}

	public void registrarse() {
		// TODO - implement Cliente.registrarse
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void crearCuenta() {
		// TODO - implement Cliente.crearCuenta
		throw new UnsupportedOperationException();
	}

}