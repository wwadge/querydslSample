package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by wwadge on 25/04/2016.
 */
@Entity
public class Book {

    @Id
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String description;
    // omitting setters/getters/constructors
}