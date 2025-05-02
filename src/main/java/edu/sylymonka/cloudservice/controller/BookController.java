package edu.sylymonka.cloudservice.controller;

/*
@author   silim
@project  web-security
@class  BookRestController
@version  1.0.0
@since 18.03.2025 - 8:57
*/

import edu.sylymonka.cloudservice.model.Book;
import edu.sylymonka.cloudservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/books")
@RestController
@AllArgsConstructor
public class BookController {
    private final BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        return service.getBook(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.create(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        service.deleteById(id);
    }

}
