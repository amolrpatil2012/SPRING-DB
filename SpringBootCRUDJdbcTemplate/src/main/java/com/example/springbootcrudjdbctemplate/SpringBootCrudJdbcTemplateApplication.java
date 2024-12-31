package com.example.springbootcrudjdbctemplate;

import com.example.springbootcrudjdbctemplate.dao.BookRepository;
import com.example.springbootcrudjdbctemplate.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootCrudJdbcTemplateApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudJdbcTemplateApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        List<Book> books = Arrays.asList(
                new Book(1,"Thinking in Java", 46),
                new Book(2,"Mkyong in Java", 199),
                new Book(3,"Getting Clojure", 373),
                new Book(4,"Head First Android Development", 41)
        );

        System.out.println("[SAVE]");
        books.forEach(book -> {
            System.out.println("Saving...{}" + book.getBookName());
            bookRepository.save(book);
        });
    }
}
