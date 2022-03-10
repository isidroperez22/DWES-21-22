package org.iesalixar.servidor.services;

import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Profesor;
import org.iesalixar.servidor.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	ProfesorRepository profRepo;
	
	@Override
	public Profesor findProfesorById(Long id) {
		return profRepo.findById(id).get();
		
	}

	@Override
	public Profesor actualizarProfesor(Profesor profesor) {
		if (profesor==null || profesor.getId() ==null ) {
			return null;
		}
		
		return profRepo.save(profesor);
	}

	@Override
	public List<Profesor> getAllProfesores() {
		// TODO Auto-generated method stub
		return profRepo.findAll();
	}

}
