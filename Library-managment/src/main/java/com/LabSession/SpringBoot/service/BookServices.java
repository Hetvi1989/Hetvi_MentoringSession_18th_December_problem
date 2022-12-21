package com.LabSession.SpringBoot.service;

import java.util.List;

import com.LabSession.SpringBoot.model.Book;

public interface BookServices {

	List<Book> findAll();
	
	Book findBookById(int bookId);
	
	Book save(Book book);
	
	void deleteBookById(int bookId);

	
}
