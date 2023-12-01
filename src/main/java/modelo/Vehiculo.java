package modelo;

public abstract class Vehiculo {

	private Automotora automotora;
	private Compra compra;
	private String marca;
	private String modelo;
	private int anioFabricaci�n;
	private double pesoVehiculo;
	private double precio;
	private int cantStock;

	public abstract double velocidadMaxPermitida();

	public String getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricaci�n() {
		return this.anioFabricaci�n;
	}

	/**
	 * 
	 * @param anioFabricaci�n
	 */
	public void setAnioFabricaci�n(int anioFabricaci�n) {
		this.anioFabricaci�n = anioFabricaci�n;
	}

	public void getPesoVehiculo() {
		// TODO - implement Vehiculo.getPesoVehiculo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pesoVehiculo
	 */
	public void setPesoVehiculo(int pesoVehiculo) {
		// TODO - implement Vehiculo.setPesoVehiculo
		throw new UnsupportedOperationException();
	}

	public double getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantStock() {
		return this.cantStock;
	}

	/**
	 * 
	 * @param cantStock
	 */
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	public abstract String getTipoVehiculo();

}