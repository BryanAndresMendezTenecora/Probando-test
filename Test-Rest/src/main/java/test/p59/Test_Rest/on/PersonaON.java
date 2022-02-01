package test.p59.Test_Rest.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import test.p59.Test_Rest.dao.PersonaDAO;
import test.p59.Test_Rest.model.Persona;

@Stateless
public class PersonaON implements PersonaONLocal, PersonaONRemote {

	@Inject
	private PersonaDAO personaDAO;
	
	public void insertarPersona(Persona persona)throws Exception {
		personaDAO.insert(persona);
	}
	
	
	public void actualizarPersona(Persona persona)throws Exception {
		personaDAO.update(persona);
	}
	
	public Persona buscarPersona(String cedula)throws Exception {
		return personaDAO.read(cedula);
	}
	
	public void eliminarPersona(String cedula)throws Exception {
		personaDAO.delete(cedula);
	}
	
	public List<Persona> getPersonas() throws Exception{
		return personaDAO.getPersonas();
	}
}
