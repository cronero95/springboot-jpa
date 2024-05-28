package com.springbootprojects.springjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class Lecture extends BaseEntity {

    @Column(
    name = "lecture_name",
    nullable = false,
    length = 50
    )
    private String name;

    @ManyToOne
    @JoinColumn(
        name = "section_id"
    )
    private Section section;

    @OneToOne
    @JoinColumn(
        name = "resource_id"
    )
    private Resource resource;
}
