package com.example.QuizAppSpring.dao;

import com.example.QuizAppSpring.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(
            value = "SELECT * FROM QUIZ_QUESTIONS q " +
                    "WHERE q.CATEGORY = :category " +
                    "ORDER BY DBMS_RANDOM.VALUE " +
                    "FETCH FIRST :numQ ROWS ONLY",
            nativeQuery = true
    )
    List<Question> findRandomQuestionsByCategory(@Param("category") String category,
                                                 @Param("numQ") int numQ);
}
