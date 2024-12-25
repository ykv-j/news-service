package edu.ykv.newsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    public SaveNewsUseCase saveNewsUseCase(WriteNewsAdapter newsAdapter) {
//        return new SaveNewsUseCaseImpl(newsAdapter);
//    }
//
//    @Bean
//    public FindNewsUseCase findNewsUseCase(ReadNewsAdapter newsAdapter) {
//        return new FindNewsUseCaseImpl(newsAdapter);
//    }
//
//    @Bean
//    public UpdateNewsUseCase updateNewsUseCase(WriteNewsAdapter newsAdapter) {
//        return new UpdateNewsUseCaseImpl(newsAdapter);
//    }
//
//    @Bean
//    public DeleteNewsUseCase deleteNewsUseCase(WriteNewsAdapter newsAdapter) {
//        return new DeleteNewsUseCaseImpl(newsAdapter);
//    }
//
//    @Bean
//    public FindAllNewsUseCase findAllNewsUseCase(ReadNewsAdapter newsAdapter) {
//        return new FindAllNewsUseCaseImpl(newsAdapter);
//    }

}

