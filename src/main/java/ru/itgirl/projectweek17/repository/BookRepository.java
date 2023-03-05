package ru.itgirl.projectweek17.repository;

import ru.itgirl.projectweek17.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    List<Book> findBookId(int id);
}
