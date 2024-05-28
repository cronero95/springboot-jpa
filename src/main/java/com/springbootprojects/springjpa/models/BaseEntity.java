package com.springbootprojects.springjpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    private Integer id;

    @Column( nullable = false )
    private LocalDateTime createdAt;

    @Column( nullable = false )
    private LocalDateTime lastModifiedAt;

    @Column( nullable = false )
    private String createdBy;

    @Column( nullable = false )
    private String lastModifiedBy;
}
