package modelo;

import java.util.*;

public class Cliente {


	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Compra> compras;
	private String nombre;
	private String apellido;
	private String rut;

	public Cliente(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		compras = new ArrayList<>();
		vehiculos = new ArrayList<>();

	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public String getRut() {
		return rut;
	}


	public Vehiculo buscarVehiculoMarca(String marca) {
		for(Vehiculo v : this.vehiculos){
			if(v.getMarca().equals(marca)){
				System.out.println(v);
				return v;
			}
		}
		System.out.println("El vehiculo con marca: " +marca+ " no se encuentra en el sistema. ");
		return null;


	}


	public Vehiculo buscarVehiculoModelo(String modelo) {
		for(Vehiculo v : this.vehiculos){
			if(v.getModelo().equals(modelo)){
				System.out.println(v);
				return v;
			}
		}
		System.out.println("El vehiculo con modelo: " +modelo+ " no se encuentra en el sistema. ");
		return null;


	}

	public Vehiculo buscarVehiculoTipo() {
		return null;


	}

	public void agregarVehiculosAlCarrito() {


	}

	public double verSubtotal() {
		return 0;

	}

	public void registrarse() {

	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void crearCuenta() {

	}

}