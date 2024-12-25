package edu.ykv.newsservice.adapter.input.impl;

import edu.ykv.newsservice.adapter.input.UpdateNewsUseCase;
import edu.ykv.newsservice.adapter.output.WriteNewsAdapter;
import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UpdateNewsUseCaseImpl implements UpdateNewsUseCase {

    private final WriteNewsAdapter newsAdapter;

    @Override
    public NewsResponse updateNews(UUID newsId, NewsUpdateDto newsUpdateDto) {
        return newsAdapter.updateNews(newsId, newsUpdateDto);
    }
}
