package edu.ykv.newsservice.dto;

import java.util.UUID;

public record NewsResponse(
        UUID id,
        String title,
        String text
) {
}