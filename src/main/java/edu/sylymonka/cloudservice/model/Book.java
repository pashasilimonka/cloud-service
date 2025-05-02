package edu.sylymonka.cloudservice.model;

/*
@author   silim
@project  cloud-service
@class  Book
@version  1.0.0
@since 02.05.2025 - 13:18
*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String publisher;
    private float price;

    public Book(String title, String author, String publisher, float price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;

    }

    @Override
    public final boolean equals(Object o) {
        if(!(o instanceof Book book)) return false;

        return  getId().equals(book.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

}
