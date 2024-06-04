package com.springbootprojects.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import com.springbootprojects.springjpa.models.Author;
//import com.github.javafaker.Faker;
//import com.springbootprojects.springjpa.models.Author;
import com.springbootprojects.springjpa.repositories.AuthorRepository;
//import com.springbootprojects.springjpa.models.Video;
//import com.springbootprojects.springjpa.repositories.VideoRepository;
import com.springbootprojects.springjpa.specifications.AuthorSpecification;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		//VideoRepository videoRepository
		AuthorRepository authorRepository
	) {
		return args -> {
			/* var video = Video.builder()
				.name("How to dance")
				.size(120000)
				.url("www.videos.com/how_to_dance")
				.length(25)
				.build();
			
			videoRepository.save(video); */
			/* for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.email(faker.internet().emailAddress())
					.age(faker.number().numberBetween(18, 80))
					.build();
				
				authorRepository.save(author);
			} */

			/* var author = Author.builder()
				.id(31)
				.firstName("Juan")
				.lastName("Rojas")
				.email("juan.rojas@gmail.com")
				.age(28)
				.build(); */
			
			/* var authors = authorRepository.findByAgeSuperiorTo(60);
			for (Author author : authors) {
					System.out.println(
						"name: "+author.getFirstName()+" "+author.getLastName()+
						"		age: "+author.getAge()
						);
			} */

			Specification<Author> specification = Specification
				.where(AuthorSpecification.hasAge(20))
				.or(AuthorSpecification.firstNameContains("n"));
			
			var authors = authorRepository.findAll(specification);
			for (Author author : authors) {
				System.out.println(
					"name: "+author.getFirstName()+" "+author.getLastName()+
					"		age: "+author.getAge()
					);
			}
		};
	}

}
