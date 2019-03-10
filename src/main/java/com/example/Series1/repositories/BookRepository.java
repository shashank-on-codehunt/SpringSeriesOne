package com.example.Series1.repositories;

import com.example.Series1.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Long> {
}
