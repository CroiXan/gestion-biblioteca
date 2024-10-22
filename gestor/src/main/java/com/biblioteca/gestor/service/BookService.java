package com.biblioteca.gestor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.gestor.model.Book;
import com.biblioteca.gestor.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookService() {
    }

    public List<Book> getAllBooks(){
        return this.bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return this.bookRepository.findById(id);
     }
  
     public Book createBook(Book book) {
        return (Book)this.bookRepository.save(book);
     }
  
     public void deleteBook(Long id) {
        this.bookRepository.deleteById(id);
     }
}
