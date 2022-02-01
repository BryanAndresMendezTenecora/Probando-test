package test.p59.Test_Rest.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import test.p59.Test_Rest.model.Vehiculo;


@Stateless
public class VehiculoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo vehiculo)throws Exception {
		em.persist(vehiculo);
	}
	
	public void update(Vehiculo vehiculo) throws Exception {
		em.merge(vehiculo);
	}
	
	public Vehiculo read(String placa) throws Exception {
		Vehiculo p = em.find(Vehiculo.class, placa);
		return p;
	}
	
	public void delete(String placa) throws Exception {
		Vehiculo p = em.find(Vehiculo.class, placa);
		em.remove(p);
	}
	
	public List<Vehiculo> getVehiculos() throws Exception{
		String jpql2="SELECT p FROM Vehiculo p";
		
		//nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Vehiculo.class);
		//query.setParameter(1, nombre);
		
		List<Vehiculo> Vehiculos=query.getResultList();
		return Vehiculos;
	}
	
}
