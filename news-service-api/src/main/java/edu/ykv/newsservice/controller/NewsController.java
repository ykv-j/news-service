package edu.ykv.newsservice.controller;

import edu.ykv.newsservice.adapter.input.DeleteNewsUseCase;
import edu.ykv.newsservice.adapter.input.FindAllNewsUseCase;
import edu.ykv.newsservice.adapter.input.FindNewsUseCase;
import edu.ykv.newsservice.adapter.input.SaveNewsUseCase;
import edu.ykv.newsservice.adapter.input.UpdateNewsUseCase;
import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController {

    private final SaveNewsUseCase saveNewsUseCase;
    private final FindNewsUseCase findNewsUseCase;
    private final UpdateNewsUseCase updateNewsUseCase;
    private final DeleteNewsUseCase deleteNewsUseCase;
    private final FindAllNewsUseCase findAllNewsUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NewsResponse saveNews(@Valid @RequestBody NewsCreateDto newsCreateDto) {
        return saveNewsUseCase.saveNews(newsCreateDto);
    }

    @GetMapping(value = "/{newsId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public NewsResponse findNews(@PathVariable("newsId") @NotNull UUID newsId) {
        return findNewsUseCase.findNews(newsId);
    }

    @PutMapping("/{newsId}")
    @ResponseStatus(HttpStatus.OK)
    public NewsResponse updateNews(
            @PathVariable("newsId") UUID newsId,
            @Valid @RequestBody NewsUpdateDto newsUpdateDto
    ) {
        return updateNewsUseCase.updateNews(newsId, newsUpdateDto);
    }

    @DeleteMapping("/{newsId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNews(@PathVariable("newsId") @NotNull UUID newsId) {
        deleteNewsUseCase.deleteNews(newsId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<NewsResponse> findAllNews(Pageable pageable) {
        return findAllNewsUseCase.findAllNews(pageable);
    }

}
