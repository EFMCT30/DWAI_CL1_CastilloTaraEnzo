package pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {

}
