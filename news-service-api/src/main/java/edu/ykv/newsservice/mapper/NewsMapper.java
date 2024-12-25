package edu.ykv.newsservice.mapper;

import edu.ykv.newsservice.domain.News;
import edu.ykv.newsservice.dto.NewsCreateDto;
import edu.ykv.newsservice.dto.NewsResponse;
import edu.ykv.newsservice.dto.NewsUpdateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface NewsMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "time", ignore = true)
    News createDtoToEntity(NewsCreateDto newsCreateDto);

    @Mapping(target = "id", source = "newsId")
    @Mapping(target = "time", source = "newsTime")
    News updateDtoToEntity(UUID newsId, LocalDateTime newsTime, NewsUpdateDto newsUpdateDto);

    NewsResponse entityToResponse(News news);

}
