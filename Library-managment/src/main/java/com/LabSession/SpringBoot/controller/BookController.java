package com.LabSession.SpringBoot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LabSession.SpringBoot.model.Book;
import com.LabSession.SpringBoot.service.BookServices;

@Controller
@RequestMapping("/books")
public class BookController {

	 private final BookServices bookServices;
	 
	 
	 public BookController(BookServices bookServices) {
		 this.bookServices = bookServices;
	 }
	 
	 @GetMapping("/list")
	 public String listBooks(Model model) {
		 List<Book> books = this.bookServices.findAll();
		 books.add(new Book("Spring", "Rod-John", "Programming"));
		 books.add(new Book("Pharmacology", "G K Jani", "Medical"));
		 books.add(new Book("Pharmaceutics", "Mark and Dell", "Pharmacy"));
		 model.addAttribute("books", books);
		 return "books/list-books";
	 }
	 
	 @GetMapping("/showFormForAdd")
	 public String showFormForAdd(Model model) {
		 Book book = new Book();
		 model.addAttribute("book", book);
		 return "books/book-form";
	 }
}
