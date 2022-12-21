package com.LabSession.SpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LabSession.SpringBoot.model.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer>{

	

	List<Book> findAll();


}
