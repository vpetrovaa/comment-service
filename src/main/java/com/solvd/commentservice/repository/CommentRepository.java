package com.solvd.commentservice.repository;

import com.solvd.commentservice.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByNoteId(Long noteId);

}
