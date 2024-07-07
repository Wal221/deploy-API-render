package com.deploy_api.demo.repository;



import com.deploy_api.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BooksRepository extends JpaRepository<Book, UUID> {

}