package com.kaushik.spring5.boot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kaushik.spring5.boot.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
