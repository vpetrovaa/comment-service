package com.solvd.commentservice.web.controller;

import com.solvd.commentservice.domain.Comment;
import com.solvd.commentservice.service.CommentService;
import com.solvd.commentservice.web.dto.CommentDto;
import com.solvd.commentservice.web.mapper.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;
    private final CommentMapper commentMapper;

    @PostMapping
    public CommentDto create(@RequestBody @Validated CommentDto commentDto) {
        Comment comment = commentMapper.toEntity(commentDto);
        comment = commentService.create(comment);
        commentDto = commentMapper.toDto(comment);
        return commentDto;
    }

    @GetMapping("/{noteId}")
    public List<CommentDto> findAllByNoteId(@PathVariable("noteId") Long noteId) {
        List<Comment> comments = commentService.findAllByNoteId(noteId);
        return commentMapper.toDtoList(comments);
    }

}
