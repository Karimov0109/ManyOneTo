package com.karimov.manyoneto.controller;

import com.karimov.manyoneto.entity.Book;
import com.karimov.manyoneto.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/1.0/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/get-all")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/get-one/{bookName}")
    public Book getOne(@PathVariable("bookName") String bookName){
        return bookService.getOne(bookName);
    }

    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @DeleteMapping("/delete-book/{bookName}")
    public void deleteBook(@PathVariable("bookName") String bookName){
        bookService.deleteBook(bookName);
    }
}
