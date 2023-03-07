package com.solvd.commentservice.service.impl;

import com.solvd.commentservice.domain.Comment;
import com.solvd.commentservice.repository.CommentRepository;
import com.solvd.commentservice.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public Comment create(Comment comment) {
        commentRepository.save(comment);
        return comment;
    }

    @Override
    public List<Comment> findAllByNoteId(Long noteId) {
        return commentRepository.findAllByNoteId(noteId);
    }

}
