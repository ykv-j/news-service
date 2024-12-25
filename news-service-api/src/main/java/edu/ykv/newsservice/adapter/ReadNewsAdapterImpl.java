package edu.ykv.newsservice.adapter;

import edu.ykv.newsservice.adapter.output.ReadNewsAdapter;
import edu.ykv.newsservice.domain.News;
import edu.ykv.newsservice.dto.NewsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import ru.clevertec.exceptionstarter.exception.EntityNotFoundException;
import edu.ykv.newsservice.mapper.NewsMapper;
import edu.ykv.newsservice.repository.NewsRepository;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ReadNewsAdapterImpl implements ReadNewsAdapter {

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    @Override
    public NewsResponse findNewsById(UUID newsId) {
        return newsRepository.findById(newsId)
                .map(newsMapper::entityToResponse)
                .orElseThrow(() ->
                        EntityNotFoundException.byEntityId(News.class, newsId)
                );
    }

    @Override
    public Page<NewsResponse> findAllNews(Pageable pageable) {
        Page<News> newsPage = newsRepository.findAll(pageable);
        return newsPage.map(newsMapper::entityToResponse);
    }

}
