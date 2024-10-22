package com.biblioteca.gestor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gestor.model.Book;
import com.biblioteca.gestor.service.BookService;

@RestController
@RequestMapping({"/api/libros"})
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController() {
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return this.bookService.createBook(book);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = this.bookService.getBookById(id);
        return (ResponseEntity)book.map(ResponseEntity::ok).orElseGet(() -> {
            return ResponseEntity.notFound().build();
        });
    }

    @DeleteMapping({"/{id}"})
    public void deleteById(@PathVariable Long id) {
        this.bookService.deleteBook(id);
    }
}
