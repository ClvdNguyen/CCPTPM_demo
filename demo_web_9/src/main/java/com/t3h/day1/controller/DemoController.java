package com.t3h.day1.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/home")
	public String homepage() {
		return "homepage";
	}

	@GetMapping("/admin")
	public String adminPage(Model model, HttpServletRequest request) {
//		Principal principal = request.getUserPrincipal();
//		model.addAttribute("user", principal.getName());
		return "admin";
	}

	@GetMapping(value = { "/user", "/" })
	public String userPage(Model model, HttpServletRequest request) {
//		Principal principal = request.getUserPrincipal();
//		model.addAttribute("user", principal.getName());
		return "user";
	}
}
