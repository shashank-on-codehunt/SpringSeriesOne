package com.example.Series1.BootStrap;

import com.example.Series1.model.Author;
import com.example.Series1.model.Books;
import com.example.Series1.repositories.AuthorRepository;
import com.example.Series1.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        iniData();
    }
    private void iniData(){
        Author eric = new Author("Eric","Manchister");
        Books books = new Books("Java Development One","ISBN  1","EricFriend");
        eric.getBooks().add(books);
        books.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(books);

        Author rex = new Author("Rex","Hill");
        Books add = new Books("Java Development Two","ISBN 2","RexFriend");
        rex.getBooks().add(add);

        authorRepository.save(rex);
        bookRepository.save(add);
    }
}
