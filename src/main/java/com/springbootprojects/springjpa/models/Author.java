package com.springbootprojects.springjpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@NamedQuery(
    name = "Author.findByAgeSuperiorTo",
    query = "select a from Author a where a.age >= :age"
)
@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

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
    length = 100
    )
    private String email;

    @Column(
    name = "author_age",
    nullable = false
    )
    private int age;
    
    @ManyToMany(
        mappedBy = "authors"
    )
    private List<Course> courses;
}
