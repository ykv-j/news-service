package edu.ykv.newsservice.adapter.input;

import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;

import java.util.UUID;

public interface UpdateNewsUseCase {

    NewsResponse updateNews(UUID newsId, NewsUpdateDto newsUpdateDto);

}
