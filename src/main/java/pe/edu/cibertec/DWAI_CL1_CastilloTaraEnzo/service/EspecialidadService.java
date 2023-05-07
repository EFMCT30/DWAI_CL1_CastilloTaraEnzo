package pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.model.bd.Especialidad;
import pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.repository.EspecialidadRepository;


@Service
public class EspecialidadService {

	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspe(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspe(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
	
}
