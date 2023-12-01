package modelo;

public class Motocicleta extends Vehiculo {

	private double HP;
	private String tipoMotor;
	private String suspension;

	public Motocicleta(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precio, int cantStock, double HP, String tipoMotor, String suspension) {
		super(marca, modelo, anioFabricacion, pesoVehiculo, precio, cantStock);
		this.HP = HP;
		this.tipoMotor = tipoMotor;
		this.suspension = suspension;
	}

	public double getHP() {
		// TODO - implement Motocicleta.getHP
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param HP
	 */
	public void setHP(double HP) {
		// TODO - implement Motocicleta.setHP
		throw new UnsupportedOperationException();
	}

	public String getTipoMotor() {
		return this.tipoMotor;
	}

	/**
	 * 
	 * @param tipoMotor
	 */
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getSuspension() {
		return this.suspension;
	}

	/**
	 * 
	 * @param suspension
	 */
	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	public double velocidadMaxPermitida() {
		// TODO - implement Motocicleta.velocidadMaxPermitida
		throw new UnsupportedOperationException();
	}

	public String getTipoVehiculo() {
		// TODO - implement Motocicleta.getTipoVehiculo
		throw new UnsupportedOperationException();
	}

}