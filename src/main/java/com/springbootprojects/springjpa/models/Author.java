package com.springbootprojects.springjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Integer id;

    @Column(
    name = "author_first_name",
    nullable = false,
    length = 50
    )
    private String firstName;
    
    @Column(
    name = "author_last_name",
    nullable = false,
    length = 50
    )
    private String lastName;

    @Column(
    name = "author_email",
    nullable = false,
    unique = true,
    length = 30
    )
    private String email;

    @Column(
    name = "author_age",
    nullable = false
    )
    private int age;
}
