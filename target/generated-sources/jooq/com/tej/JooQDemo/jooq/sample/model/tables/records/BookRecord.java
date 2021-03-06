/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.Book;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends TableRecordImpl<BookRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>jooq.Book.Name</code>.
     */
    public BookRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jooq.Book.Name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>jooq.Book.Pages</code>.
     */
    public BookRecord setPages(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jooq.Book.Pages</code>.
     */
    public String getPages() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Book.BOOK.NAME;
    }

    @Override
    public Field<String> field2() {
        return Book.BOOK.PAGES;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getPages();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getPages();
    }

    @Override
    public BookRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public BookRecord value2(String value) {
        setPages(value);
        return this;
    }

    @Override
    public BookRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(String name, String pages) {
        super(Book.BOOK);

        setName(name);
        setPages(pages);
    }
}
