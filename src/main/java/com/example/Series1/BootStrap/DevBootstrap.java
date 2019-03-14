package com.example.Series1.BootStrap;

import com.example.Series1.model.Author;
import com.example.Series1.model.Books;
import com.example.Series1.model.Publisher;
import com.example.Series1.repositories.AuthorRepository;
import com.example.Series1.repositories.BookRepository;
import com.example.Series1.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository,PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository =publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        iniData();
    }
    private void iniData(){
        Publisher publisher1 = new Publisher();
        publisher1.setName("EricFriend");
        publisher1.setAddress("Address1");
        Author eric = new Author("Eric","Manchister");
        Books books = new Books("Java Development One","ISBN  1",publisher1);
        eric.getBooks().add(books);
        books.getAuthors().add(eric);

        publisherRepository.save(publisher1);
        authorRepository.save(eric);
        bookRepository.save(books);

        Publisher publisher2 = new Publisher();
        publisher2.setName("RexFriend");
        publisher2.setAddress("Address2");
        Author rex = new Author("Rex","Hill");
        Books add = new Books("Java Development Two","ISBN 2",publisher2);
        rex.getBooks().add(add);

        publisherRepository.save(publisher2);
        authorRepository.save(rex);
        bookRepository.save(add);
    }
}
