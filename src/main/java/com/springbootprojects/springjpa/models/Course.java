package com.springbootprojects.springjpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Integer id;

    @Column(
    name = "course_title",
    nullable = false,
    length = 50
    )
    private String title;

    @Column(
    name = "course_description",
    nullable = false,
    length = 200
    )
    private String description;

    @ManyToMany
    @JoinTable(
        name = "authors_courses",
        joinColumns = {
            @JoinColumn(name = "course_id")
        },
        inverseJoinColumns = {
            @JoinColumn(name = "author_id")
        }
    )
    private List<Author> authors;

    @OneToMany(
        mappedBy = "course"
    )
    private List<Section> sections;
}
