package com.springbootprojects.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprojects.springjpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
