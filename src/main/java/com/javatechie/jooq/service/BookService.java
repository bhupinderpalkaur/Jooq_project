package com.javatechie.jooq.service;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private DSLContext dslContext;


    public void insertBook(Book book) {
        dslContext.insertInto(Tables.BOOK, Tables.BOOK.NAME, Tables.BOOK.PAGES)
                .values(book.getName(), book.getPages())
                .execute();
    }

    public List<Book> getBooks() {
        return dslContext.selectFrom(Tables.BOOK)
                .fetchInto(Book.class);
    }
}
