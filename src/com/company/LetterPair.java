package com.company;

/**
 * Created by Vitaliy on 1/19/2016.
 */
public class LetterPair {
    public LetterPair(char letter, int division) {
        this.letter = letter;
        this.division = division;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "LetterPair{" +
                "letter=" + letter +
                ", division=" + division +
                '}';
    }

    private char letter;
    private int division;

}
