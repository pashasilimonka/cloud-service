package edu.sylymonka.cloudservice.service;

import edu.sylymonka.cloudservice.model.Book;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author   silim
@project  cloud-service
@class  BookService
@version  1.0.0
@since 02.05.2025 - 13:21
*/
@Service
@RequiredArgsConstructor
public class BookService {

    private List<Book> books;

    @PostConstruct
    public void init() {
        books.add(new Book("1", "Багряні ріки", "Жан-Крістоф Гранже", "КСД", 350));
        books.add(new Book("2", "Знайди мене", "Енн Фрейзер", "КСД", 300));
        books.add(new Book("3", "Скажи мені", "Енн Фрейзер", "Yakaboo", 320));
        books.add(new Book("4", "Третя дівчина", "Агата Крісті", "Yakaboo", 400));
    }


    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String id) {
        return books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteById(String id) {
        books.removeIf(b -> b.getId().equals(id));
    }

    public Book create(Book book) {
        books.add(book);
        return book;
    }

    public Book update(Book book) {
        books.removeIf(b -> b.getId().equals(book.getId()));
        books.add(book);
        return book;
    }
}
