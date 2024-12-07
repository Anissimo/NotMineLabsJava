package org.example.lab4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private String title;
    private List<Sentence> sentences;

    public Text(String title) {
        this.title = title;
        this.sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public void printText() {
        System.out.println(title);
        for (Sentence sentence : sentences) {
            System.out.println(sentence.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(title, text.title) &&
                Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, sentences);
    }

    @Override
    public String toString() {
        return "Text{" +
                "title='" + title + '\'' +
                ", sentences=" + sentences +
                '}';
    }
}
