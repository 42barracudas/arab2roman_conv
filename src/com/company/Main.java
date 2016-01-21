package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LetterPair> list = new LinkedList<>();
        list.add(new LetterPair('a', 33));
	    CollectionEx collectionEx = new CollectionEx(list);
        collectionEx.print();
    }
}
