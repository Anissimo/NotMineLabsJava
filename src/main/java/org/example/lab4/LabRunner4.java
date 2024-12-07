package org.example.lab4;

import org.example.lab4.task1.Guitar;
import org.example.lab4.task1.Sentence;
import org.example.lab4.task1.StringMy;
import org.example.lab4.task1.Text;
import org.example.lab4.task1.Word;
import org.example.lab4.task2.Boots;
import org.example.lab4.task2.Gloves;
import org.example.lab4.task2.Helmet;
import org.example.lab4.task2.Jacket;
import org.example.lab4.task2.Motorcyclist;

public class LabRunner4 {
    public static void runLab() {
        // Задача 1
        Text text = new Text("Заголовок");
        Sentence sentence = new Sentence();
        sentence.addWord(new Word("Слово"));
        text.addSentence(sentence);
        text.printText();

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();
        guitar.replaceString(new StringMy("Струна"));

        // Задача 2
        Motorcyclist motorcyclist = new Motorcyclist();
        motorcyclist.addAmunition(new Helmet(100, 0.5));
        motorcyclist.addAmunition(new Jacket(200, 1.0));
        motorcyclist.addAmunition(new Gloves(50, 0.2));
        motorcyclist.addAmunition(new Boots(150, 0.8));
        motorcyclist.printAmunitions();
        motorcyclist.sortByWeight();
        motorcyclist.findAmunitionsByPriceRange(50, 200);
    }
}