package ru.itgirl.projectweek17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.projectweek17.model.Book;
import ru.itgirl.projectweek17.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

    @GetMapping("/book")
    public List<Book> getBookId(@RequestParam(value="id", defaultValue = "1") int id) {
        return bookRepository.findBookId(id);
    }


}
