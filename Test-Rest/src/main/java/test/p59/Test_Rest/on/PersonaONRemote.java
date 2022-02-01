package test.p59.Test_Rest.on;

import java.util.List;

import javax.ejb.Remote;

import test.p59.Test_Rest.model.Persona;

@Remote
public interface PersonaONRemote {

	public void insertarPersona(Persona persona)throws Exception;
	public void actualizarPersona(Persona persona)throws Exception;
	public Persona buscarPersona(String cedula)throws Exception;
	public void eliminarPersona(String cedula)throws Exception;
	public List<Persona> getPersonas() throws Exception;
}
