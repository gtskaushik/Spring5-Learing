package com.kaushik.spring5.boot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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
@ToString(exclude = { "authors" })
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private @NonNull String title;
	private @NonNull String isbn;
	@OneToOne
	private @NonNull Publisher publisher;

	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors = new HashSet<Author>();

}
