package com.projetdenovation.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.projetdenovation.demo.service.Servicee;
import com.projetdenovation.domain.Etudient;
import com.projetdenovation.domain.Remarque;

@Controller
public class Controleur {
	private Servicee servicee;

	@Autowired
	public Controleur(Servicee servicee) {
		super();
		this.servicee = servicee;
	}
	

	@GetMapping("/home")
	public ModelAndView getdata() {
		String view = new String("home");
		Map<String, Object> model = new HashMap<String, Object>();
		// model.put("etudientcurrent", etudientcurrent.getName());
		// model.put("listderemarque", servicee.getlistRemarque(etudientcurrent));
		return new ModelAndView(view, model);
	}

	@GetMapping("/")
	public ModelAndView getforum() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("etudient", new Etudient());
		return new ModelAndView("index", model);
	}

	@PostMapping("/")
	public ModelAndView postforum(Etudient etudient) {
		RedirectView rdv = new RedirectView();

		if (servicee.etudientVerificationcin(etudient.getPassword()) != null) {

			rdv.setUrl("/home");
			// etudientcurrent = etudient;
			// listderemarque = service.getlistRemarque(etudient);
			// listderemarque = etudientrepository.getRemarquelist(etudient);
		} else

			rdv.setUrl("/");

		return new ModelAndView(rdv);
	}

	@GetMapping("/remarque")
	public ModelAndView getindex() {
		String view = new String("remarqueform");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("remarqueo", new Remarque());
		return new ModelAndView(view, model);
	}

	@PostMapping("/remarque")
	public ModelAndView putform(Remarque remarque) {

		RedirectView rd = new RedirectView();
		// service.addRemarque(remarque);
		servicee.addRemarque(remarque);
		// etudientcurrent=servicee.etudientVerificationcin(remarque.getCinetudient());
		rd.setUrl("/");
		return new ModelAndView(rd);
	}

}
