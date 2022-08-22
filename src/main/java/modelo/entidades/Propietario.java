package modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Propietario
 *
 */
@Entity(name = "PROPIETARIO")

public class Propietario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_propietario")
	private String nombre;
	
	@Column(name = "clave_propietario")
	private String password;
	
	@Column(name = "usuario_propietario")
	private String usuario;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "propietario" )
	private List<Mascota> mascotas;

	public Propietario() {
		super();
	}

	public Propietario(String nombre, String password, String usuario) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", usuario=" + usuario + "]";
	}
	
	
   
}
