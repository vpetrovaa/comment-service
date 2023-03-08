package com.solvd.commentservice.service.impl;

import com.solvd.commentservice.domain.Comment;
import com.solvd.commentservice.domain.exception.ResourceDoesNotExistException;
import com.solvd.commentservice.repository.CommentRepository;
import com.solvd.commentservice.service.CommentService;
import com.solvd.commentservice.service.client.NoteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final NoteClient noteClient;

    @Override
    public Comment create(Comment comment) {
        boolean isNoteExistById = noteClient.isExistById(comment.getNoteId());
        if(!isNoteExistById){
            throw new ResourceDoesNotExistException("Note with id " + comment.getNoteId() + " does not exist");
        }
        commentRepository.save(comment);
        return comment;
    }

    @Override
    public List<Comment> findAllByNoteId(Long noteId) {
        return commentRepository.findAllByNoteId(noteId);
    }

}
