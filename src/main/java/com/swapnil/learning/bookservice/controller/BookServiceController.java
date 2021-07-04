package com.swapnil.learning.bookservice.controller;

import com.swapnil.learning.bookservice.model.Books;
import com.swapnil.learning.bookservice.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookServiceController {
    @Autowired
    BookService service;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public List<Books> getAllBooks(){
       return service.getAllBooks();
    }

    @PostMapping
    public Books createBook(@RequestBody Books book){
        return service.createBook(book);
    }
}
