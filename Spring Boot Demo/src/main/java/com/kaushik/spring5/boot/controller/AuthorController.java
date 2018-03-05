package com.kaushik.spring5.boot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaushik.spring5.boot.model.Author;
import com.kaushik.spring5.boot.repositories.AuthorRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AuthorController {

	private AuthorRepository authorRepository;
	
	@RequestMapping("/authors")
	public String getAuthors(Model model){
		List<Author> authors = (List<Author>) authorRepository.findAll();
		authors.forEach(author -> {
			author.getBooks().forEach(System.out::println);
		});
		model.addAttribute("authors", authors);
		
		return "authors";
	}
}
