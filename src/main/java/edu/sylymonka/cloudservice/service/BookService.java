package edu.sylymonka.cloudservice.service;

import edu.sylymonka.cloudservice.model.Book;
import edu.sylymonka.cloudservice.repository.BookRepository;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    //private List<Book> books;

//    @PostConstruct
//    public void init() {
//        books.add(new Book("1", "Багряні ріки", "Жан-Крістоф Гранже", "КСД", 350));
//        books.add(new Book("2", "Знайди мене", "Енн Фрейзер", "КСД", 300));
//        books.add(new Book("3", "Скажи мені", "Енн Фрейзер", "Yakaboo", 320));
//        books.add(new Book("4", "Третя дівчина", "Агата Крісті", "Yakaboo", 400));
//        bookRepository.saveAll(books);
//    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Book book) {
        return bookRepository.save(book);
    }
}
