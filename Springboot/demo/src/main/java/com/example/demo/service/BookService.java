package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {
    public Book createBook(Book book);

    public List<Book> getAllBook();

    public Book getBookById(long id);

}
