package com.springbootprojects.springjpa.specifications;

import org.springframework.data.jpa.domain.Specification;

import com.springbootprojects.springjpa.models.Author;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class AuthorSpecification {

    public static Specification<Author> hasAge(int age) {
        return(
            Root<Author> root, 
            CriteriaQuery<?> query, 
            CriteriaBuilder builder
        ) -> {
            if(age < 0) return null;

            return builder.equal(root.get("age"), age);
        };
    }

    public static Specification<Author> firstNameLike(String firstName) {
        return(
            Root<Author> root, 
            CriteriaQuery<?> query, 
            CriteriaBuilder builder
        ) -> {
            if(firstName == null) return null;

            return builder.like(root.get("firstName"), firstName);
        };
    }

    public static Specification<Author> firstNameStartsWith(String firstNameStart) {
        return(
            Root<Author> root, 
            CriteriaQuery<?> query, 
            CriteriaBuilder builder
        ) -> {
            if(firstNameStart == null) return null;

            return builder.like(root.get("firstName"), firstNameStart+"%");
        };
    }

    public static Specification<Author> firstNameContains(String firstNameSection) {
        return(
            Root<Author> root, 
            CriteriaQuery<?> query, 
            CriteriaBuilder builder
        ) -> {
            if(firstNameSection == null) return null;

            return builder.like(root.get("firstName"), "%"+firstNameSection+"%");
        };
    }
}
