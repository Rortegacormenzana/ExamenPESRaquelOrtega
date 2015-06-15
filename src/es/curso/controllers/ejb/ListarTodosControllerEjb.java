package es.curso.controllers.ejb;

import java.util.ArrayList;

import javax.ws.rs.client.Client;

import es.curso.controllers.ListarTodosController;
import es.curso.model.Entity.Tarjeta;
import es.curso.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class ListarTodosControllerEjb implements ListarTodosController {

	@Override
	public ArrayList<Tarjeta> listarTodos() {
		TarjetaDaoJdbc daoTarjeta = new TarjetaDaoJdbc();
		ArrayList<Tarjeta> tarjetas = daoTarjeta.findAll();
		return tarjetas;
	}
	
}
