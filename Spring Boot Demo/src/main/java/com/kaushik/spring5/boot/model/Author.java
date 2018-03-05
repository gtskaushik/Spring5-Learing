package com.kaushik.spring5.boot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = { "id" })
@Data
@ToString(exclude = { "books" })
@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private @NonNull String firstName;
	private @NonNull String lastName;

	@ManyToMany(mappedBy = "authors")
	private Set<Book> books = new HashSet<Book>();
}
