package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.training.services.InfoServiceImpl;

@Controller
public class InfoController {

	private static final String INFO_MODEL = "info";

	@Autowired
	private InfoServiceImpl service;

	@GetMapping({ "/", "/info" })
	public String getInfo(Model model) {
		model.addAttribute(INFO_MODEL, service.getInfo());
		return "info";
	}
}
