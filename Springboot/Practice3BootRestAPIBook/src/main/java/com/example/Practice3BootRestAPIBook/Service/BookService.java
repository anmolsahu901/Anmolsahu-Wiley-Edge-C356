package com.example.Practice3BootRestAPIBook.Service;

import com.example.Practice3BootRestAPIBook.Modal.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Interact with dao layer that this will call the database wale methods
@Component
public class BookService {
    private static List<Book> list = new ArrayList<Book>();

    static{
        list.add(new Book(1,"JAva book","Anmol"));
        list.add(new Book(2,"C++ book","raju"));
        list.add(new Book(3,"Python book","Guddu"));
    }

    //get all books
    public List<Book> getAllBooks(){
        return list;
    }

    //get book by id
    public Book getBookById(int id){
        Book book = null;
        try{
            book =  list.stream()
                    .filter(e->e.getId()==id)
                    .findFirst().get();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // add new book
    public Book addBook(Book b)
    {
        list.add(b);
        return b;
    }

    //delete book by id
    public void deleteBook(int bid){
       list =  list.stream()
                .filter(book-> book.getId()!=bid)
                .collect(Collectors.toList());

    }

    public void updateBookById(Book book, int book_id){
          list =  list.stream()
                    .map(b->{
                       if(book.getId()==b.getId()){
                           b.setAuthor(book.getAuthor());
                           b.setTitle(book.getTitle());
                       }return b;
                    }).collect(Collectors.toList());
    }

}
