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
}
