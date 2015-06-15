package es.curso.dispatchers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ActualizarController;
import es.curso.controllers.EliminarController;
import es.curso.controllers.ejb.ActualizarControllerEjb;
import es.curso.controllers.ejb.DarAltaTarjetaControllerEjb;
import es.curso.controllers.ejb.EliminarControllerEjb;
import es.curso.controllers.ejb.ListarTodosControllerEjb;
import es.curso.model.Entity.Tarjeta;

/**
 * Servlet implementation class TiendaServlet
 */
@WebServlet("/Banco/*")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BancoServlet() {
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		String titulo ="Sin título";
		
		RequestDispatcher rd;
				
		
		switch(action){
		
			case "altaTarjeta": // se debe redirigir hacia el formulario altaTarjeta
				rd= request.getRequestDispatcher("/jsp/altaTarjeta.jsp");
				rd.forward(request, response);
				
				break;
			case "ampliarCupo": 
				rd= request.getRequestDispatcher("/jsp/ampliarCupo.jsp");
				rd.forward(request, response);
				break;
				
			
			case "bloquearTarjeta":
				rd= request.getRequestDispatcher("/jsp/bloquearTarjeta.jsp");
				rd.forward(request, response);
				break;
				
			case "enviarPago":
				rd= request.getRequestDispatcher("/jsp/enviarPago.jsp");
				rd.forward(request, response);
				break;	
			
			case "listarTodos":
				ListarTodosControllerEjb todos = new ListarTodosControllerEjb();
				ArrayList<Tarjeta> tarjetas = todos.listarTodos();
				request.setAttribute("tarjetas", tarjetas);
				titulo="Listado general de Tarjetas bancarias";
				request.setAttribute("titulo", titulo);
				rd = request.getRequestDispatcher("/jsp/listarTodos.jsp");
				rd.forward(request, response);			
				break;
				
			
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd;
		
		switch(action){
			case "altaTarjeta": // recuperar los datos tecleados en formulario
				Integer id = Integer.parseInt(request.getParameter("id"));
				String numero = request.getParameter("numero");
				Integer cupoMaximo = Integer.parseInt(request.getParameter("cupoMaximo"));
				Integer saldoDisponible = Integer.parseInt(request.getParameter("saldoDisponible"));
				String tipo = request.getParameter("tipo");
				Integer numComprobacion = Integer.parseInt(request.getParameter("numComprobacion"));
				String contrasenha = request.getParameter("contrasenha");
				String bloqueada = request.getParameter("bloqueada");
				
				Tarjeta tarjeta = new Tarjeta 
						(id, numero, cupoMaximo, saldoDisponible, tipo, numComprobacion, contrasenha, bloqueada);
				
				// se invocara al controlador adecuado
				DarAltaTarjetaControllerEjb controlador= new DarAltaTarjetaControllerEjb();
				controlador.agregar(tarjeta);
				rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
				break;
				
			/* NO FUNCIONA Y ROMPE TODO 
			case "eliminar": // recuperar el id tecleado en el formulario
				int id = Integer.parseInt(request.getParameter("id"));
				EliminarController eliminarEjb = new EliminarControllerEjb();	
				eliminarEjb.eliminar(id);
				
				response.sendRedirect("listarTodos");				
				break;
				
			case "actualizar": // recuperar los datos que vienen del formulario
				int idTarjeta = Integer.parseInt(request.getParameter("id"));
				String numeroTarjeta = request.getParameter("numero");
				int cupoMaximoTarjeta = Integer.parseInt(request.getParameter("cupoMaximo"));
				int saldoDisponibleTarjeta = Integer.parseInt(request.getParameter("saldoDisponible"));
				String tipoTarjeta = request.getParameter("tipo");
				int numComprobacionTarjeta = Integer.parseInt(request.getParameter("numComprobacion"));
				int contrasenhaTarjeta = Integer.parseInt(request.getParameter("contrasenha"));
				String bloqueadaTarjeta = request.getParameter("bloqueada");
				
				
				Tarjeta tarjetaModif = new Tarjeta (idTarjeta, numeroTarjeta, 
						cupoMaximoTarjeta, saldoDisponibleTarjeta, tipoTarjeta, 
						numComprobacionTarjeta, contrasenhaTarjeta, bloqueadaTarjeta);
				
				ActualizarController actualizarEjb = new ActualizarControllerEjb();
				
				actualizarEjb.actualizar(tarjetaModif);
				response.sendRedirect("listarTodos");	
				break;
				*/
		}
	}

}
