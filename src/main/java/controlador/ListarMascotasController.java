package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.conexion.Mascota;
import modelo.conexion.MascotaDAO;
import modelo.dao.GenericDAO;
import modelo.dao.PropietarioDAO;
import modelo.entidades.Propietario;
import modelo.jpaDao.JPAMascotaDAO;
import modelo.jpaDao.JPAPropietarioDAO;

/**
 * Servlet implementation class ListarMascotasController
 */
@WebServlet("/ListarMascotasController")
public class ListarMascotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarMascotasController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesarSolicitud(request, response);
	}

	private void procesarSolicitud(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener parámetros
		// 2.- Conectarse al modelo
		
		Propietario p = new Propietario();
		p.setNombre("Gandhy");
		
		MascotaDAO mascotaModelo = new JPAMascotaDAO();
		List<Mascota> mascotas = mascotaModelo.getMascotasByPropietario(p.getId());
		
		PropietarioDAO propietarioModelo = new JPAPropietarioDAO();


		// 3. Redireccionar a la vista
		request.setAttribute("misMascotas", mascotas);
		request.setAttribute("nombrePropietario", p.getNombre());
		request.getRequestDispatcher("/jsp/listarMascotas.jsp").forward(request, response);
	}
}
