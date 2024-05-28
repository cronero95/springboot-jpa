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
@Table(name = "lectures")
public class Lecture {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Integer id;

    @Column(
    name = "lecture_name",
    nullable = false,
    length = 50
    )
    private String name;
}
