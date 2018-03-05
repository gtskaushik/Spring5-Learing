package com.kaushik.spring5.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.spring5.boot.model.Book;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {
	
	private BookRepository bookRepository;
	
	@RequestMapping("/books")
	public List<Map<String,String>> getBooks(){
		List<Book> books = (List<Book>) bookRepository.findAll();
//		books.forEach(book -> {
//			book.getAuthors().forEach(System.out::println);
//		});
//		model.addAttribute("books", books);
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "Kaushik");
		list.add(map);
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("name", "Leela");
		list.add(map1);
		
		return list;
	}

}
