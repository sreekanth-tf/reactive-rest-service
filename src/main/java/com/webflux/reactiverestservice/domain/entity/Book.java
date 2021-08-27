package com.webflux.reactiverestservice.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
}
