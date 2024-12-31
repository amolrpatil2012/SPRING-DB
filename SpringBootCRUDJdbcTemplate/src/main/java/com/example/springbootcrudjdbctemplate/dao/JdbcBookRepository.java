package com.example.springbootcrudjdbctemplate.dao;

import com.example.springbootcrudjdbctemplate.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcBookRepository implements BookRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate
                .queryForObject("select count(*) from book", Integer.class);
    }

    @Override
    public int save(Book book) {
        return jdbcTemplate.update(
                "insert into book (bookid,bookname, bookprice) values(?,?,?)",
                book.getBookId(),
                book.getBookName(), book.getBookPrice());
    }

    @Override
    public int update(Book book) {
        return jdbcTemplate.update(
                "update book set price = ? where id = ?",
                book.getBookPrice(), book.getBookId());
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByNameAndPrice(String name, long price) {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String getNameById(Long id) {
        return null;
    }
}
