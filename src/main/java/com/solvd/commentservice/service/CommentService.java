package com.solvd.commentservice.service;

import com.solvd.commentservice.domain.Comment;

import java.util.List;

public interface CommentService {

    Comment create(Comment comment);

    List<Comment> findAllByNoteId(Long noteId);

}
