package org.iesalixar.servidor.services;

import java.util.List;

import org.iesalixar.servidor.model.Grado;

public interface GradosService {
	
	public List<Grado> getAllGrados();
	public Grado getGradoByNombre(String nombre);
	public Grado insertarGrado(Grado grado);
	public Grado findGradoById(Long id);
}
