package com.example.QuizAppSpring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "QUIZ_QUESTIONS")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "DIFFICULTYLEVEL")
    private String difficultyLevel;

    @Column(name = "QUESTION_TITLE")
    private String questionTitle;

    @Column(name = "OPTION1")
    private String option1;

    @Column(name = "OPTION2")
    private String option2;

    @Column(name = "OPTION3")
    private String option3;

    @Column(name = "OPTION4")
    private String option4;

    @Column(name = "RIGHT_ANSWER")
    private String rightAnswer;
}
