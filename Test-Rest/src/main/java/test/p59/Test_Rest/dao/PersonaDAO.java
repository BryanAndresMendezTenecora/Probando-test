package test.p59.Test_Rest.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import test.p59.Test_Rest.model.Persona;

@Stateless
public class PersonaDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Persona persona) {
		em.persist(persona);
	}
	
	public void update(Persona persona) {
		em.merge(persona);
	}
	
	public Persona read(String cedula) {
		Persona p = em.find(Persona.class, cedula);
		return p;
	}
	
	public void delete(String cedula) {
		Persona p = em.find(Persona.class, cedula);
		em.remove(p);
	}

	
	public List<Persona> getPersonas() throws Exception{
		String jpql2="SELECT p FROM Persona p";
		
		//nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Persona.class);
		//query.setParameter(1, nombre);
		
		List<Persona> personas=query.getResultList();
		return personas;
	}
}
