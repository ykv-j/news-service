package edu.ykv.newsservice.adapter.input.impl;

import edu.ykv.newsservice.adapter.input.SaveNewsUseCase;
import edu.ykv.newsservice.adapter.output.WriteNewsAdapter;
import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class SaveNewsUseCaseImpl implements SaveNewsUseCase {

    private final WriteNewsAdapter newsAdapter;

    @Override
    public NewsResponse saveNews(NewsCreateDto newsCreateDto) {
        return newsAdapter.saveNews(newsCreateDto);
    }

}
