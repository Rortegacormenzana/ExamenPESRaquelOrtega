package es.curso.controllers.ejb;

import es.curso.controllers.ActualizarController;
import es.curso.model.Entity.Tarjeta;
import es.curso.persistence.model.dao.TarjetaDao;
import es.curso.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class ActualizarControllerEjb implements ActualizarController{

	@Override
	public void actualizar(Tarjeta tarjeta) {
		TarjetaDao tarjetaDao = new TarjetaDaoJdbc();
		// 1. comprobar si esta autorizado a modificar
		tarjetaDao.update(tarjeta);
		// enviar email al cliente
		// enviar email a la seguridad social por ejemplo
		
	}

}
