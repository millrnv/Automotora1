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
		this.tipo = "Motocicleta";

	}

	public double getHP() {
		return HP;
	}


	public void setHP(double HP) {
		this.HP = HP;
	}

	public String getTipoMotor() {
		return this.tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getSuspension() {
		return this.suspension;
	}


	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	public double velocidadMaxPermitida() {
		double velMax = ((HP*2)/pesoVehiculo)*20;

		return velMax;

	}

	public String getTipoVehiculo() {
		return "Motocicleta. ";
	}

}