public class QuizGrader { // ito yung pangalan ng class
    public static void main(String[] args) { // ito ay method kung saan mag sisimula ang program

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; // mga tamang sagot
        char[] studentAnswer = {'A','B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; // ito naman yung sagot ng student
        int correctCount = 0; // dito naman yung pag bilang kung ilan ang tama

        System.out.println("\n===== ANSWER KEY ====="); // umpisa ng answer key
        for (int i = 0; i < answerKey.length; i++) { //  loop para isa isa makuha yung answer key
            System.out.println("Answer Key: " + answerKey[i]); //pinapakita yung answer key
        } // pag tapos ng loop para sa answer key
        System.out.println("\n===== STUDENT ANSWER ====="); // umpisa ng student answer
        for (int i = 0; i < studentAnswer.length; i++) { // loop para mapakita ang student answer
            System.out.println("Student Answer: " + studentAnswer[i]); // pinapakita dito yung answer ng student
        } // pag tapos ng loop sa student answer

        for (int i = 0; i < answerKey.length; i++) { // loop para makita kung ilan ang tamang sagot
            if(answerKey[i] == studentAnswer[i]){ // binubuksan ang if statement kapag tama ang sagot
                correctCount++; // dinadagdagan ng isa ang correctCount kapag tama
            } //  dito nagtatapos ang if statemen
        } // dito nagtatapos ang for loop na nagche-check ng answers

        double scorePercentage = (double) correctCount / answerKey.length * 100;
        // Kinukuha ang percentage ng tamang sagot

        System.out.println("\n===== QUIZ RESULT ====="); // pinapakita ang heading ng quiz result

        System.out.println("Correct Answer: " + correctCount + "/" + answerKey.length); // pinapakita kung ilan yung tamang sagot
        System.out.println("Score Percentage: " + scorePercentage + "%"); //pinapakita yung score percnetage

        if(scorePercentage >= 70.0) {  // tinitingnan kung ang score ay 70% pataas
            System.out.println("Result PASS!"); // ito ay result kung 70 pataas ay PASS
        } // dito nagtatapos ang if statement
        else {  //  binubuksan ang else kapag hindi umabot sa 70%
            System.out.println("Result FAIL!"); // ito ay result pag hindi umabot sa 70%
        } // dito nagtatapos ang else statemeny
    } // dito nagtatapos ang main method
} // dito nagtatapos ang QuizGrader class
