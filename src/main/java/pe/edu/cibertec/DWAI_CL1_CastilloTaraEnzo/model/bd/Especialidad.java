package pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {

	@Id
	@Column(name = "idesp")
	private String idesp;
	@Column(name = "nomesp")
	private String nomesp;
	@Column(name = "costo")
	private Double costo;
}
