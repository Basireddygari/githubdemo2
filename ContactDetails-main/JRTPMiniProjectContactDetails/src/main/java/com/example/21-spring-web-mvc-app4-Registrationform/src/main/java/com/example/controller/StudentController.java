package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.studentform.StudentForm;

@Controller
public class StudentController {
	@GetMapping("/student")
	public String loadForm(Model m) {
		 m.addAttribute("studentform",new StudentForm ());
		return "index";
	}
@PostMapping("/savee")
	public String saveMeth(StudentForm s,Model m1) {
		String s1=s.getName()+",thanks for registraion";
		m1.addAttribute("msg",s1);
		return "success";
	}
}
