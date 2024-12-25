package edu.ykv.newsservice.adapter.input.impl;

import edu.ykv.newsservice.adapter.input.FindAllNewsUseCase;
import edu.ykv.newsservice.adapter.output.ReadNewsAdapter;
import edu.ykv.newsservice.dto.NewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAllNewsUseCaseImpl implements FindAllNewsUseCase {

    private final ReadNewsAdapter newsAdapter;


    @Override
    public Page<NewsResponse> findAllNews(Pageable pageable) {
        return newsAdapter.findAllNews(pageable);
    }

}
