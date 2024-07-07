package com.deploy_api.demo.controller;

import com.deploy_api.demo.model.Book;
import com.deploy_api.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/")
    public List<Book> list() {
        return this.booksRepository.findAll();
    }

    @PostMapping("/")
    public Book create(@RequestBody Book book) {
        return this.booksRepository.save(book);
    }

}