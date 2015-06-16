package es.curso.persistence.model.dao;

import java.util.ArrayList;

import es.curso.model.Entity.Tarjeta;

public interface TarjetaDao {
	
	public void create(Tarjeta tarjeta);
	
	public ArrayList<Tarjeta> findAll();
	
	public void ampliarCupo (Tarjeta tarjeta);
	
	public void bloquearTarjeta (Tarjeta tarjeta);

	public void update(Tarjeta tarjeta);
	
	public void enviarPago (Tarjeta tarjeta);

	public void delete(int id);
	
	
	

}
