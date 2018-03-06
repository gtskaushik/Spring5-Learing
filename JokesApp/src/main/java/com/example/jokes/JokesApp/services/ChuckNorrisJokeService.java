package com.example.jokes.JokesApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeService() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
