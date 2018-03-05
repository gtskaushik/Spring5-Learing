package com.kaushik.spring5.boot.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.kaushik.spring5.boot.controller.BookRepository;
import com.kaushik.spring5.boot.model.Author;
import com.kaushik.spring5.boot.model.Book;
import com.kaushik.spring5.boot.model.Publisher;
import com.kaushik.spring5.boot.repositories.AuthorRepository;
import com.kaushik.spring5.boot.repositories.PublisherRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	private void initData() {
		// Eric
		Author eric = new Author("Eric", "Evans");
		Publisher oreilly = new Publisher("O'Reilly Publications", "Canada");
		Book ddd = new Book("Domain Driven Design", "1234", oreilly);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
//		System.out.println(ddd);
//		System.out.println(eric);
//		System.out.println(oreilly);

		publisherRepository.save(oreilly);
		authorRepository.save(eric);
		bookRepository.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Publisher local = new Publisher("Local Publications", "Canada");
		Book noEJB = new Book("J2EE Development without EJB", "23444", local);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		publisherRepository.save(local);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		// Initializes data into Database
		initData();
		
	}
}
