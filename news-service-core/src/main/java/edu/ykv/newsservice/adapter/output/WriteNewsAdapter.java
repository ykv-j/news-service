package edu.ykv.newsservice.adapter.output;

import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;

import java.util.UUID;

public interface WriteNewsAdapter {

    NewsResponse saveNews(NewsCreateDto newsCreateDto);

    NewsResponse updateNews(UUID newsId, NewsUpdateDto newsUpdateDto);

    void deleteNewsById(UUID newsId);

}
