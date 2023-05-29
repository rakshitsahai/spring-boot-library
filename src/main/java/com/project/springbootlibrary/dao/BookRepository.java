package com.project.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootlibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
