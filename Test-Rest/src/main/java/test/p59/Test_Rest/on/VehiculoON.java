package test.p59.Test_Rest.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import test.p59.Test_Rest.dao.VehiculoDAO;
import test.p59.Test_Rest.model.Vehiculo;

@Stateless
public class VehiculoON implements VehiculoONLocal, VehiculoONRemote {

	@Inject
	private VehiculoDAO vehiculoDAO;
	
	
	public void insertarVehiculo(Vehiculo vehiculo) throws Exception{
		vehiculoDAO.insert(vehiculo);
	}
	
	
	public void actualizarVehiculo(Vehiculo vehiculo) throws Exception {
		vehiculoDAO.update(vehiculo);
	}
	
	public Vehiculo buscarVehiculo(String placa) throws Exception {
		return vehiculoDAO.read(placa);
	}
	
	public void eliminarVehiculo(String placa) throws Exception {
		vehiculoDAO.delete(placa);
	}
	
	
	public List<Vehiculo> getVehiculos() throws Exception{
		return vehiculoDAO.getVehiculos();
	}
}
