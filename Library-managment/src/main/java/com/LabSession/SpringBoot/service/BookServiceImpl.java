package com.LabSession.SpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.LabSession.SpringBoot.model.Book;
import com.LabSession.SpringBoot.repository.BookJpaRepository;

//Singleton bean 
@Service
public class BookServiceImpl implements BookServices{

	// constructor based dependency injection
	private final BookJpaRepository bookJpaRepository;
	
	public BookServiceImpl(BookJpaRepository repository) {
		this.bookJpaRepository = repository;
	}

	public List<Book> findAll() {
		
		return this.bookJpaRepository.findAll();
	}

	
	public Book findBookById(int bookId) {
		return this.bookJpaRepository.findById(bookId).orElseThrow(()-> new IllegalArgumentException("invalid book id"));
		
	}

	
	public Book save(Book book) {
		
		 return this.bookJpaRepository.save(book);
	}

	
	public void deleteBookById(int bookId) {
		this.bookJpaRepository.deleteById(bookId);
		
	}

}
