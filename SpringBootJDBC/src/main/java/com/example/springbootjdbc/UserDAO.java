package com.example.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserDAO {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    public void createTable()
    {
        String query = "Create Table if Not Exists User ( Id int primary key , Name varchar(100), Email varchar(100))";
        System.out.println("Table Created : " + jdbcTemplate.update(query));


    }

}
