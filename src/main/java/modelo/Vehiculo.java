package modelo;

public abstract class Vehiculo {

	private Automotora automotora;
	private Compra compra;
	private String marca;
	private String modelo;
	private int anioFabricación;
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

	public int getAnioFabricación() {
		return this.anioFabricación;
	}

	/**
	 * 
	 * @param anioFabricación
	 */
	public void setAnioFabricación(int anioFabricación) {
		this.anioFabricación = anioFabricación;
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