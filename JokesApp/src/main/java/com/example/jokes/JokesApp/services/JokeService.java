package com.example.jokes.JokesApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {

	ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
