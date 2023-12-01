package modelo;

public abstract class Vehiculo {

	private Automotora automotora;
	private Compra compra;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private double pesoVehiculo;
	private double precio;
	private int cantStock;

	public Vehiculo(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precio, int cantStock){
		this.marca =marca;
		this.modelo=modelo;
		this.anioFabricacion=anioFabricacion;
		this.pesoVehiculo=pesoVehiculo;
		this.precio=precio;
		this.cantStock=cantStock;

	}


	public abstract double velocidadMaxPermitida();

	public String getMarca() {
		return this.marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return this.anioFabricacion;
	}


	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public void getPesoVehiculo() {
		// TODO - implement Vehiculo.getPesoVehiculo
		throw new UnsupportedOperationException();
	}


	public void setPesoVehiculo(int pesoVehiculo) {
		// TODO - implement Vehiculo.setPesoVehiculo
		throw new UnsupportedOperationException();
	}

	public double getPrecio() {
		return this.precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantStock() {
		return this.cantStock;
	}


	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	public abstract String getTipoVehiculo();

}