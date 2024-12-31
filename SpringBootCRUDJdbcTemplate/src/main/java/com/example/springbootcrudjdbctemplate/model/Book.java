package com.example.springbootcrudjdbctemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private  long bookId;
    private String bookName;
    private  long bookPrice;
}
