package edu.ykv.newsservice.adapter.input;


import edu.ykv.newsservice.dto.NewsResponse;

import java.util.UUID;

public interface FindNewsUseCase {


    NewsResponse findNews(UUID newsId);
}
