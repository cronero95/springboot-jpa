package com.springbootprojects.springjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "resource_type")
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Integer id;

    @Column(
    name = "resource_name",
    nullable = false,
    length = 50
    )
    private String name;

    @Column(
    name = "resource_size",
    nullable = false
    )
    private int size;

    @Column(
    name = "resource_url",
    nullable = false,
    length = 100
    )
    private String url;

    @OneToOne
    @JoinColumn(
        name = "lecture_id"
    )
    private Lecture lecture;
}
