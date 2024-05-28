package com.springbootprojects.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprojects.springjpa.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
