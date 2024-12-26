package io.sharpen.matchmaker_ai_backend;

import io.sharpen.matchmaker_ai_backend.profiles.Gender;
import io.sharpen.matchmaker_ai_backend.profiles.Profile;
import io.sharpen.matchmaker_ai_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchmakerAiBackendApplication implements CommandLineRunner {

	@Autowired
	ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(MatchmakerAiBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Profile shanProfile = new Profile(
				"1",
				"Shan",
				"S",
				88,
				"Indian",
				Gender.MALE,
				"Student",
				"shan.jpg",
				"INT"
		);
		profileRepository.save(shanProfile);
		profileRepository.findAll().forEach(System.out::println);
	}
}
