package modelo.dao;

import java.util.List;

import modelo.entidades.Mascota;
import modelo.entidades.Persona;
import modelo.entidades.Preferencias;

public interface MascotaDAO extends GenericDAO<Mascota, Integer>{
	public List<Mascota> getMascotas(Preferencias preferencias);
	public List<Mascota> getMisMascotas(Persona propietario);
}
