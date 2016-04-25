package com.example.repo;

import com.example.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wwadge on 25/04/2016.
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}