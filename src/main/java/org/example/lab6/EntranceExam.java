package org.example.lab6;

public class EntranceExam {
    private String subject;
    private int score;

    public EntranceExam(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }
}