package com.solvd.commentservice.web.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CommentDto {

    private Long id;

    @NotNull(message = "Description is required")
    @Length(max = 200, message = "Description must be shorter than 200 characters")
    private String description;

    @NotNull(message = "Note id is required")
    private Long noteId;

}
