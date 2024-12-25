package edu.ykv.newsservice.adapter.input;


import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import org.springframework.stereotype.Service;

@Service
public interface SaveNewsUseCase {

    NewsResponse saveNews(NewsCreateDto newsCreateDto);

}
