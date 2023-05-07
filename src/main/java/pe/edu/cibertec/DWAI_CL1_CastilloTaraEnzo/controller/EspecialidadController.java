package pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.model.bd.Especialidad;
import pe.edu.cibertec.DWAI_CL1_CastilloTaraEnzo.service.EspecialidadService;

@Controller
@RequestMapping("Especialidad")
public class EspecialidadController {

	@Autowired
	private EspecialidadService espeService;

	@GetMapping("/frmMantEspecialidad")
	public String frmMantEspecialidad(Model model) {
		model.addAttribute("listaEspe", espeService.listarEspe());
		return "Especialidad/frmMantEspecialidad";
	}

	@GetMapping("/frmRegEspecialidad")
	public String frmRegEstado(Model model) {
		model.addAttribute("espeForm", new Especialidad());
		model.addAttribute("visualizar", false);
		return "Especialidad/frmRegEspecialidad";
	}

	@PostMapping("/frmRegEspecialidad")
	public String registrarEstado(@ModelAttribute("espeForm") Especialidad especialidad, Model model) {
		String mensaje = "Estado registrado correctamente";
		try {
			espeService.registrarEspe(especialidad);
		} catch (Exception e) {
			mensaje = "Estado no registrado";
		}

		model.addAttribute("espeForm", new Especialidad());
		model.addAttribute("visualizar", true);
		model.addAttribute("respuesta", mensaje);

		return "Especialidad/frmRegEspecialidad";
	}

}
