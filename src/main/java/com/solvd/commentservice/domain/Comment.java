package com.solvd.commentservice.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(name = "note_id")
    private Long noteId;

}
