package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Vitaliy on 1/15/2016.
 */
public class ArrabicToRomanConverter {

    private String convertedValue;
    private int number;
    private List<LetterPair> pairs;

    public ArrabicToRomanConverter() {
        this.pairs =  new ArrayList<>();
        this.convertedValue = "";
        formPairs();
    }

    private void formPairs(){
        pairs.add(new LetterPair('M', 1000));
        pairs.add(new LetterPair('D', 500));
        pairs.add(new LetterPair('C', 100));
        pairs.add(new LetterPair('L', 50));
        pairs.add(new LetterPair('X', 10));
        pairs.add(new LetterPair('V', 5));
        pairs.add(new LetterPair('I', 1));
    }

    public String convert(int number) {
        this.number = number;
        String result = getRomanNumber();
        if (result != null) {
            result = getFixedRomanResult(result);
            return result;
        }
        return "error number";
    }

    private String getFixedRomanResult(String result) {
        result = result.replaceAll("VIIII","IX");
        result = result.replaceAll("IIII","IV");
        return result;
    }

    private String getRomanNumber() {
        for(int i =0; i <7; i++) {
            LetterPair pair = pairs.get(i);
            drawSymb(pair.getLetter(), pair.getDivision());
        }
        return convertedValue;
    }

    private void drawSymb(char symb_roman, int division) {
        while (number / division >= 1) {
            convertedValue = convertedValue + symb_roman;
            number = number - division;
        }
    }

}
