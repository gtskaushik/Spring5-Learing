package com.example.jokes.JokesApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jokes.JokesApp.services.JokeService;

@RestController
public class JokesRestController {

	private JokeService jokeService;

	public JokesRestController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping("/getajoke")
	public String getAJoke(){
		return jokeService.getJoke();
	}

}
