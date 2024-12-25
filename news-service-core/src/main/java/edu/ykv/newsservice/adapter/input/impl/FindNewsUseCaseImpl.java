package edu.ykv.newsservice.adapter.input.impl;

import edu.ykv.newsservice.adapter.input.FindNewsUseCase;
import edu.ykv.newsservice.adapter.output.ReadNewsAdapter;
import edu.ykv.newsservice.dto.NewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class FindNewsUseCaseImpl implements FindNewsUseCase {

    private final ReadNewsAdapter newsAdapter;

    @Override
    public NewsResponse findNews(UUID newsId) {
        return newsAdapter.findNewsById(newsId);
    }

}
