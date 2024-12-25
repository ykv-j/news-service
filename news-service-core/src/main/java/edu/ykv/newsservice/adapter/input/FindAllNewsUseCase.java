package edu.ykv.newsservice.adapter.input;

import edu.ykv.newsservice.dto.NewsResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindAllNewsUseCase {

    Page<NewsResponse> findAllNews(Pageable pageable);

}
