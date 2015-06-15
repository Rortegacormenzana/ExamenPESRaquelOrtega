package es.curso.controllers.ejb;

import es.curso.controllers.EliminarController;
import es.curso.persistence.model.dao.TarjetaDao;
import es.curso.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class EliminarControllerEjb implements EliminarController {

	@Override
	public void eliminar(int id) {
		TarjetaDao tarjetaDao = new TarjetaDaoJdbc();
		// verificar si no tiene deudas ...
		tarjetaDao.delete(id);
		// mandarle correo al usuario para confirmar la baja
		
	}

}
