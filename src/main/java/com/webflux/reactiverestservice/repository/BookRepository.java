package com.webflux.reactiverestservice.repository;

import com.webflux.reactiverestservice.domain.entity.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
