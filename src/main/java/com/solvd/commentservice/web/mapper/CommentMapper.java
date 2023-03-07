package com.solvd.commentservice.web.mapper;

import com.solvd.commentservice.domain.Comment;
import com.solvd.commentservice.web.dto.CommentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentDto toDto(Comment comment);

    Comment toEntity(CommentDto commentDto);

    List<CommentDto> toDtoList(List<Comment> comments);

}
