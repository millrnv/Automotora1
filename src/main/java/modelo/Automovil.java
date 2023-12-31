package modelo;

public class Automovil extends Vehiculo {

	private double HP;
	private int nPuertas;
	private double tamaņoMotor;


	public Automovil(String marca, String modelo, int anioFabricacion, double pesoVehiculo, double precio, int cantStock, double HP, int nPuertas, double tamaņoMotor) {
		super(marca, modelo, anioFabricacion, pesoVehiculo, precio, cantStock);
		this.HP = HP;
		this.nPuertas = nPuertas;
		this.tamaņoMotor = tamaņoMotor;
		this.tipo = "Automovil";
	}

	public double getHP() {
		return HP;
	}


	public void setHP(double HP) {
		this.HP = HP;
	}

	public int getNPuertas() {
		return this.nPuertas;
	}


	public void setNPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public double getTamaņoMotor() {
		return this.tamaņoMotor;
	}


	public void setTamaņoMotor(double tamaņoMotor) {
		this.tamaņoMotor = tamaņoMotor;
	}

	public double velocidadMaxPermitida() {
		double velMax = (HP/pesoVehiculo)*10;

		double velocidadMaximaLimite = 100;

		if (velMax > velocidadMaximaLimite) {
			velMax = velocidadMaximaLimite;

		}return velMax;

	}


	public String getTipoVehiculo() {
		return "Automovil. ";
	}

}