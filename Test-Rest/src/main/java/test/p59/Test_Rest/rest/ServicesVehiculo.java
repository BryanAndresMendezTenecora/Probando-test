package test.p59.Test_Rest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import test.p59.Test_Rest.model.Persona;
import test.p59.Test_Rest.model.Vehiculo;
import test.p59.Test_Rest.on.PersonaONLocal;
import test.p59.Test_Rest.on.VehiculoONLocal;

@Path("vehiculo")
public class ServicesVehiculo {

	
	@Inject
	private VehiculoONLocal vehiculoON;
	
	@Inject
	private PersonaONLocal personaON;
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public String ingresarVehiculo(Vehiculo vehiculo) {
		
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
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vehiculo> getVehiculos(){
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		try {
			vehiculos=vehiculoON.getVehiculos();
			return vehiculos;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return vehiculos;
		}
	}
	
}
