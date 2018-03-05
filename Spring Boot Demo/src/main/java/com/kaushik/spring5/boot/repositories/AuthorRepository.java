package com.kaushik.spring5.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kaushik.spring5.boot.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
