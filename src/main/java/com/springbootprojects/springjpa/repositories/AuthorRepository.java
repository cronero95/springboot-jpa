package com.springbootprojects.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprojects.springjpa.models.Author;
import java.util.List;
import java.util.Optional;


public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);

    void deleteAllByAge(int age);

    List<Author> findAllByFirstNameAndLastName(String firstName, String lastName);

    int countAllByAge(int age);

    Optional<Author> findFirstByLastName(String lastName);
}
