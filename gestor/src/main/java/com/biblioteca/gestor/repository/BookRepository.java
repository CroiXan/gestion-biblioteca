package com.biblioteca.gestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.gestor.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
