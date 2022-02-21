package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Departamento;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradosServiceImpl implements GradosService {
	
	@Autowired
	GradoRepository gradoRepo;
	
	@Override
	public List<Grado> getAllGrados() {
		// Obtengo el resultado a través del repositorio
		List<Grado> asignBD = gradoRepo.findAll();

		// Verificando que he obtenido algo
		if (asignBD != null && asignBD.size() > 0) {

			return asignBD;
		}
		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Grado>();
	}

	@Override
	public Grado getGradoByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grado insertarGrado(Grado grado) {
		if (grado!=null && getGradoByNombre(grado.getNombre())==null) {
			Grado grados = gradoRepo.save(grado);
			return grados;
		}
		
		return null;
	}

	@Override
	public Grado findGradoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
