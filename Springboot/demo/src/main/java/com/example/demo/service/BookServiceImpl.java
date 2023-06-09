package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book createBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(long id) {


return null;
//        return bookRepo.findById(id);
    }
}
