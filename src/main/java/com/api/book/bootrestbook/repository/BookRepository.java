package com.api.book.bootrestbook.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.book.bootrestbook.bean.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {

}
