package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidades.Mascota;
import modelo.entidades.Preferencias;

@WebServlet("/MisMascotasController")
public class MisMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MisMascotasController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}
	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener Parametros
		// Hablar con el modelo	
		List<Mascota> mascotas = DAOFactory.getFactory().getMascotaDAO().getMisMascotas(1);
		// Envio a la vista
		request.setAttribute("mascotas", mascotas);
		request.getRequestDispatcher("/jsp/misMascotas.jsp").forward(request, response);
	}

}