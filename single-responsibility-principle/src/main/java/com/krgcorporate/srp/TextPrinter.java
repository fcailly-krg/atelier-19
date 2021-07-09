package com.krgcorporate.srp;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class TextPrinter {

    private final TextManipulator textManipulator;

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}