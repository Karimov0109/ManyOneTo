package com.karimov.manyoneto.service;

import com.karimov.manyoneto.entity.Book;
import com.karimov.manyoneto.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getOne(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String bookName){
        bookRepository.deleteBookByBookName(bookName);
    }
}
