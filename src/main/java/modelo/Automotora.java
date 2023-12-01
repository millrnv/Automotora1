package modelo;


import java.util.*;

public class Automotora {

	protected ArrayList<Vehiculo> vehiculos;
	private ArrayList<Cliente> clientes;


	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public boolean agregarVehiculo(){
		return true;


	}

	public boolean clienteExiste(Cliente cliente){

		for(Cliente c : clientes){
			if(cliente.getRut().equals(c.getRut())){
				return true;
			}
		}
		return false;


	}




	public Vehiculo buscarVehiculo() {
		return null;
	}

	public boolean agregarCliente(Cliente cliente) {
		if(!clienteExiste(cliente)){
			clientes.add(cliente);
			return true;
		}
		return false;
	}

	public void catalogoVehiculos() {

	}

	public void realizarVenta() {

	}

	public void getInfoVehiculo() {

	}

}