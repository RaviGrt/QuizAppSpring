package com.example.QuizAppSpring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "QUIZ")
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @ManyToMany
    @JoinTable(
            name = "QUIZ_QUESTION_MAPPING",
            joinColumns = @JoinColumn(name = "QUIZ_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUESTION_ID")
    )
    private List<Question> questions;
}
