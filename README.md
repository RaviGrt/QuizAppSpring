# QuizAppSpring 

A Spring Boot REST API for managing quiz questions and quizzes.  
You can:

- Add questions to the database  
- Create a quiz for a given category with random questions  
- Fetch quiz questions (without answers)  
- Submit user responses and calculate the score  

---

## 🧱 Tech Stack

- **Language:** Java 21  
- **Framework:** Spring Boot 4 (Spring Web, Spring Data JPA)  
- **Database:** Oracle (19c+)  
- **ORM:** Hibernate / JPA  
- **Build Tool:** Maven  
- **Other:** Lombok  

---

## 📁 Project Structure

```text
src/main/java/com/example/QuizAppSpring
│
├── controller
│   ├── QuestionController   // APIs for question management
│   └── QuizController       // APIs for quiz creation, fetch, submit
│
├── dao
│   ├── QuestionDao          // JPA repository for Question
│   └── QuizDao              // JPA repository for Quiz
│
├── model
│   ├── Question             // Entity mapped to QUIZ_QUESTIONS
│   ├── Quiz                 // Entity mapped to QUIZ
│   ├── QuestionWrapper      // DTO: question without right answer
│   └── Response             // DTO: { id, response }
│
└── service
    ├── QuestionService      // Business logic for questions
    └── QuizService          // Business logic for quizzes
