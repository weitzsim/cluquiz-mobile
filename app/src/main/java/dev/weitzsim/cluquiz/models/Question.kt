package dev.weitzsim.cluquiz.models

import kotlinx.serialization.Serializable

@Serializable
public data class Question (
    val type: String,
    val difficulty: String,
    val category: String,
    val question: String,
    val correct_answer: String,
)

/*

{
    "response_code": 0,
    "results": [
    {
        "type": "multiple",
        "difficulty": "medium",
        "category": "General Knowledge",
        "question": "Which of these companies does NOT manufacture automobiles?",
        "correct_answer": "Ducati",
        "incorrect_answers": [
        "Nissan",
        "GMC",
        "Fiat"
        ]
    },
    {
        "type": "multiple",
        "difficulty": "medium",
        "category": "General Knowledge",
        "question": "When did the website &quot;Facebook&quot; launch?",
        "correct_answer": "2004",
        "incorrect_answers": [
        "2005",
        "2003",
        "2006"
        ]
    },
    {
        "type": "multiple",
        "difficulty": "medium",
        "category": "General Knowledge",
        "question": "Where does water from Poland Spring water bottles come from?",
        "correct_answer": "Maine, United States",
        "incorrect_answers": [
        "Hesse, Germany",
        "Masovia, Poland",
        "Bavaria, Poland"
        ]
    },
    {
        "type": "multiple",
        "difficulty": "medium",
        "category": "General Knowledge",
        "question": "Which of the following Ivy League universities has its official motto in Hebrew as well as in Latin?",
        "correct_answer": "Yale University",
        "incorrect_answers": [
        "Princeton University",
        "Harvard University",
        "Columbia University"
        ]
    },
    {
        "type": "multiple",
        "difficulty": "medium",
        "category": "General Knowledge",
        "question": "A statue of Charles Darwin sits in what London museum?",
        "correct_answer": "Natural History Museum",
        "incorrect_answers": [
        "Tate",
        "British Museum",
        "Science Museum"
        ]
    }
    ]
}
*/