package com.swapnil.learning.bookservice.service;

import com.swapnil.learning.bookservice.dao.BookRepository;
import com.swapnil.learning.bookservice.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Books> getAllBooks(){
        return repository.findAll();
    }

    public Books createBook(Books book){
        return repository.insert(book);
    }
}
