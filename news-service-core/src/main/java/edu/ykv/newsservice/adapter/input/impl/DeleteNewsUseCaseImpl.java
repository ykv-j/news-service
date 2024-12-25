package edu.ykv.newsservice.adapter.input.impl;

import edu.ykv.newsservice.adapter.input.DeleteNewsUseCase;
import edu.ykv.newsservice.adapter.output.WriteNewsAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DeleteNewsUseCaseImpl implements DeleteNewsUseCase {

    private final WriteNewsAdapter newsAdapter;

    @Override
    public void deleteNews(UUID newsId) {
        newsAdapter.deleteNewsById(newsId);
    }

}
