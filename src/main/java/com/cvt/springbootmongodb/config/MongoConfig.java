package com.cvt.springbootmongodb.config;

import com.cvt.springbootmongodb.model.User;
import com.cvt.springbootmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.cvt.springbootmongodb.repository")
public class MongoConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                userRepository.save(new User(1,"Aman","SCIO",12000));
                userRepository.save(new User(2,"Nipun","SCIO",12000));
                userRepository.save(new User(3,"Naveen","Motor",12000));
                userRepository.save(new User(4,"Anil","Test",20000));

            }
        };
    }
}
