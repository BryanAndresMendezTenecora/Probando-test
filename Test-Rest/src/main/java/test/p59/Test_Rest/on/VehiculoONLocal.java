package test.p59.Test_Rest.on;

import java.util.List;

import javax.ejb.Local;

import test.p59.Test_Rest.model.Vehiculo;

@Local
public interface VehiculoONLocal {

	public void insertarVehiculo(Vehiculo vehiculo) throws Exception;
	public void actualizarVehiculo(Vehiculo vehiculo) throws Exception;
	public Vehiculo buscarVehiculo(String placa) throws Exception;
	public void eliminarVehiculo(String placa) throws Exception;
	public List<Vehiculo> getVehiculos() throws Exception;
}
