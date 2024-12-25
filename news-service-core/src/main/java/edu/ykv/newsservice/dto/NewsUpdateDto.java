package edu.ykv.newsservice.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record NewsUpdateDto(
        @NotBlank(message = "Title is null or empty")
        @Length(max = 255, message = "Title is more than 255 characters")
        String title,
        @NotBlank(message = "Text is null or empty")
        String text
) {
}