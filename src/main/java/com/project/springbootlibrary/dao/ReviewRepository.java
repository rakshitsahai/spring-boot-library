package com.project.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootlibrary.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
