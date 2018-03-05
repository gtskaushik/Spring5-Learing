package com.kaushik.spring5.boot.controller;

import org.springframework.data.repository.CrudRepository;

import com.kaushik.spring5.boot.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
