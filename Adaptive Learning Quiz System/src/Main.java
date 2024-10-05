public class Main {
    public static void main(String[] args) {
        // Create some sample questions
        Question[] questions = new Question[] {
                new Question("What is 2 + 2?", new String[]{"3", "4", "5"}, 2),
                new Question("What color is the sky?", new String[]{"Blue", "Red", "Green"}, 1),
                new Question("Which animal is known as the king of the jungle?", new String[]{"Lion", "Tiger", "Elephant"}, 1)
        };

        // Start the quiz
        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
    }
}
