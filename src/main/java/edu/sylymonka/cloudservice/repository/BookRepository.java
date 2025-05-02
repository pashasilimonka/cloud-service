package edu.sylymonka.cloudservice.repository;

import edu.sylymonka.cloudservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@author   silim
@project  cloud-service
@class  BookRepository
@version  1.0.0
@since 02.05.2025 - 15:57
*/
@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
