package com.example.Practice3BootRestAPIBook.Controllers;

import com.example.Practice3BootRestAPIBook.Modal.Book;
import com.example.Practice3BootRestAPIBook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@Controller //controller return view name
@RestController // return value like string so now no need to use @ResponseBody
public class BookController {

    @Autowired
    private BookService bookService;

//    @RequestMapping(value = "/books",method = RequestMethod.GET)
//    @ResponseBody is use to share data not view name
    // data GET karne k liye getmapping
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list =  this.bookService.getAllBooks();
        if(list.size()<=0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.of(Optional.of(list));

    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id)
    {
       Book book= bookService.getBookById(id);
        if(book==null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.of(Optional.of(book));
    }

    //@RequestBody: json format me data add karoge postman to vo json to object convert hoke save ho jayga
    //@PostMapping: data POST karne k liye postmapping
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);

    }

    @DeleteMapping("/books/{id}")
    public String deletedBook(@PathVariable("id") int book_id)
    {
        this.bookService.deleteBook(book_id);
        return "Deleted successfully";
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") int book_Id,@RequestBody Book book){
         this.bookService.updateBookById(book,book_Id);
        return book;
    }


}
