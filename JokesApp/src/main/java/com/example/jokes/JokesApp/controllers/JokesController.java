package com.example.jokes.JokesApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokes.JokesApp.services.JokeService;

@Controller
public class JokesController {
	
	JokeService jokeService;
	
	public JokesController(JokeService jokeService){
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping("/")
	public String getAJoke(Model model) {
		String joke = jokeService.getJoke();
		model.addAttribute("joke", joke);
		
		return "chucknorris";
	}

}
