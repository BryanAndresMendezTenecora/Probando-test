package test.p59.Test_Rest.soap;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import test.p59.Test_Rest.model.Persona;
import test.p59.Test_Rest.model.Vehiculo;
import test.p59.Test_Rest.on.PersonaONLocal;
import test.p59.Test_Rest.on.VehiculoONLocal;

@WebService
public class ServicesVehiculo {

	@Inject
	private VehiculoONLocal vehiculoON;
	@Inject
	private PersonaONLocal personaON;
	
	@WebMethod
	public String insertarVehiculo(Vehiculo vehiculo) {
		Persona p=vehiculo.getPersona();
		try {
			p=personaON.buscarPersona(p.getCodigo());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(p == null) {
			try {
				personaON.insertarPersona(vehiculo.getPersona());
				vehiculoON.insertarVehiculo(vehiculo);
				return "OK";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "ERROR";
			}
		}else {
			try {
				vehiculoON.insertarVehiculo(vehiculo);
				return "OK";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "ERROR";
			}
		}
		
	}
	
	@WebMethod
	public List<Vehiculo> getVehiculos(){
		List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
		try {
			vehiculos=vehiculoON.getVehiculos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehiculos;
	}
	
}
