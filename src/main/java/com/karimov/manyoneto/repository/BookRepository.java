package com.karimov.manyoneto.repository;

import com.karimov.manyoneto.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByBookName(String bookName);
    Book deleteBookByBookName(String bookName);
}
