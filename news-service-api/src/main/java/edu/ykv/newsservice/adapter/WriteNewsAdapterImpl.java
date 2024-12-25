package edu.ykv.newsservice.adapter;

import edu.ykv.newsservice.adapter.output.WriteNewsAdapter;
import edu.ykv.newsservice.domain.News;
import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.clevertec.exceptionstarter.exception.EntityNotFoundException;
import edu.ykv.newsservice.mapper.NewsMapper;
import edu.ykv.newsservice.repository.NewsRepository;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class WriteNewsAdapterImpl implements WriteNewsAdapter {

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    @Override
    public NewsResponse saveNews(NewsCreateDto newsCreateDto) {
        News news = newsMapper.createDtoToEntity(newsCreateDto);
        News newsSaved = newsRepository.save(news);
        return newsMapper.entityToResponse(newsSaved);
    }

    @Override
    public NewsResponse updateNews(UUID newsId, NewsUpdateDto newsUpdateDto) {
        News updateNews = newsRepository.findById(newsId)
                .map(news -> newsMapper.updateDtoToEntity(news.getId(), news.getTime(), newsUpdateDto))
                .orElseThrow(() ->
                        EntityNotFoundException.byEntityId(News.class, newsId)
                );

        return newsMapper.entityToResponse(newsRepository.save(updateNews));
    }

    @Override
    public void deleteNewsById(UUID newsId) {
        Optional.ofNullable(newsId)
                .map(newsRepository::findById)
                .ifPresent(news -> newsRepository.deleteById(newsId));
    }

}
