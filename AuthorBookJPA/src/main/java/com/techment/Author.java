package com.techment;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Author420")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int authorId;
	String name;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL) //pdhna h ise
	Set<BookAssignment> books;

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BookAssignment> getBooks() {
		return books;
	}

	public void setBooks(Set<BookAssignment> books) {
		this.books = books;
	}
	
	
	
	
}
