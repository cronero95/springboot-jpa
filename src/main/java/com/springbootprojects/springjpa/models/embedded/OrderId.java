package com.springbootprojects.springjpa.models.embedded;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable 
public class OrderId implements Serializable {

    private String userName;
    private LocalDateTime orderDateTime;
}
