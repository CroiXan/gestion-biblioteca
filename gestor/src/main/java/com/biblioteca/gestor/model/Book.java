package com.biblioteca.gestor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_book;
    private int publish_year; 
    private String title;  
    private String author; 
    private String descripcion;
    private String genre;

    public Book() {
    }
    
    public Long getId_book() {
        return id_book;
    }
    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }
    public int getPublish_year() {
        return publish_year;
    }
    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
