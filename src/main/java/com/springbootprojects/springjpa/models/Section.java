package com.springbootprojects.springjpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "sections")
public class Section extends BaseEntity {

    @Column(
    name = "section_name",
    nullable = false,
    length = 50
    )
    private String name;

    @Column(
    name = "section_order",
    nullable = false
    )
    private int order;

    @ManyToOne
    @JoinColumn(
        name = "course_id"
    )
    private Course course;

    @OneToMany(
        mappedBy = "section"
    )
    private List<Lecture> lectures;
}
