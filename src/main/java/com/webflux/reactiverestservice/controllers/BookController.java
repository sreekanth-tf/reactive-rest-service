package com.webflux.reactiverestservice.controllers;

import com.webflux.reactiverestservice.domain.entity.Book;
import com.webflux.reactiverestservice.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Flux<Book> getBook() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Mono<Book> postBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping
    public Mono<Book> updateBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping
    public boolean deleteBook(@RequestBody Book book) {
        try {
            bookRepository.deleteById(book.getId()).subscribe();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
