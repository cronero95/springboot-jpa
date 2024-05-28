package com.springbootprojects.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springbootprojects.springjpa.models.Video;
import com.springbootprojects.springjpa.repositories.VideoRepository;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		VideoRepository videoRepository
	) {
		return args -> {
			var video = Video.builder()
				.name("How to dance")
				.size(120000)
				.url("www.videos.com/how_to_dance")
				.length(25)
				.build();
			
			videoRepository.save(video);
		};
	}

}
