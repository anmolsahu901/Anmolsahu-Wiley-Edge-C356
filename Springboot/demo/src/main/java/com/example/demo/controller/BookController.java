package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

//    @PostMapping("/Book")
//    public Book createBook(@RequestBody Book book){
//        return bookService.createBook(book);
//
//    }
//
//    @PostMapping("/Book")
//    public List<Book> getAllBook(){
//        return bookService.getAllBook();
//    }

//    @GetMapping("/Book/{id}")
//    public Book getBookById(@PathVariable ("id") long id) {
//        return bookService.getBookByAuthor(id);
//    }



}
