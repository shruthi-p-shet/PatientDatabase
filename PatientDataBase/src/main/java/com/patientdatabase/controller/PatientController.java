package com.patientdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patientdatabase.entity.Patient;
import com.patientdatabase.service.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService service;

	//url="/" 
	//login form will be shown
	@GetMapping
	public String login() {
		return "login";
	}
	
	// url="/patients/home"
	// after logging in home will be displayed
	@GetMapping("/patients/home")
	public String home() {
		return "home";
	}

	// url="/patients/addPatient"
	// shows input page to enter data
	@GetMapping("/patients/addPatient")
	public String addPatient() {
		return "addPatient";
	}

	// url="/save"
	// it will help us to send data from front-end to database
	@PostMapping("/save")
	public String savePatient(@ModelAttribute Patient p) {
		service.saveData(p);
		return "redirect:/patients/allData";
	}

	// url="/patients/allData"
	// shows all the data present in database
	@GetMapping("/patients/allData")
	public ModelAndView getAllPatient() {
		List<Patient> list = service.getAllData();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("allData");
		mav.addObject("patients", list);
		return mav;
	}

	// method PUT
	// url="/patients/edit/{id}"
	// shows input form to change any details of existing entry
	@RequestMapping("/patients/edit/{id}")
	public String eidt(@PathVariable("id") int id, Model model) {
		Patient patient = service.getPatient(id);
		model.addAttribute("patient", patient);
		return "edit";
	}

	//url="/patients/delete/{id}"
	//used to delete the entry
	@RequestMapping("/patients/delete/{id}")
	public String deletePatient(@PathVariable("id") int id) {
		service.deleteData(id);
		return "redirect:/patients/allData";

	}

}
