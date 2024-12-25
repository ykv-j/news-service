package edu.ykv.newsservice.adapter.output;

import edu.ykv.newsservice.dto.NewsResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ReadNewsAdapter {

    NewsResponse findNewsById(UUID newsId);

    Page<NewsResponse> findAllNews(Pageable pageable);

}
